import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class246 extends class285 {

    @OriginalMember(owner = "client!ri", name = "db", descriptor = "[I")
    private int[] field3893 = new int[257];

    @OriginalMember(owner = "client!ri", name = "Z", descriptor = "I")
    public static int field3889 = 0;

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "[I")
    public static int[] field3883 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ri", name = "X", descriptor = "[I")
    public static int[] field3887 = new int[128];

    @OriginalMember(owner = "client!ri", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field3895 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!ri", name = "U", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!ri", name = "V", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!ri", name = "Y", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!ri", name = "ab", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!ri", name = "bb", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!ri", name = "cb", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!ri", name = "eb", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "Lak;")
    public static class172 field3878;

    @OriginalMember(owner = "client!ri", name = "W", descriptor = "[[I")
    private int[][] field3886;

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V", line = 11)
    public class246() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "(I)V", line = 15)
    public static void method1755(int arg0) {
        field3883 = null;
        field3887 = null;
        if (arg0 < -89) {
            field3895 = null;
            field3878 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(B)V", line = 29)
    private final void method1756(byte arg0) {
        if (arg0 <= 72) {
            this.field3886 = (int[][]) ((int[][]) null);
        }
        field3880++;
        int var2 = this.field3886.length;
        if (var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = 0;
            int var5 = var3 << 4;
            for (int var6 = 0; var6 < var2 && var5 >= this.field3886[var6][0]; var6++) {
                var4++;
            }
            int var8;
            int var9;
            int var10;
            if (var4 >= var2) {
                int[] var7 = this.field3886[var2 - 1];
                var8 = var7[1];
                var9 = var7[3];
                var10 = var7[2];
            } else {
                int[] var11 = this.field3886[var4];
                if (var4 <= 0) {
                    var10 = var11[2];
                    var8 = var11[1];
                    var9 = var11[3];
                } else {
                    int[] var12 = this.field3886[var4 - 1];
                    int var13 = (var5 - var12[0] << 12) / (var11[0] - var12[0]);
                    int var14 = 4096 - var13;
                    var9 = var11[3] * var13 + var12[3] * var14 >> 12;
                    var8 = var11[1] * var13 + (var12[1] * var14) >> 12;
                    var10 = var11[2] * var13 + var12[2] * var14 >> 12;
                }
            }
            int var15 = var10 >> 4;
            int var16 = var9 >> 4;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            int var17 = var8 >> 4;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            this.field3893[var3] = class122.method882(var16, class122.method882(var15 << 8, var17 << 16));
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)Llf;", line = 136)
    public static final class317 method1757(int arg0, int arg1) {
        if (arg0 != 2313) {
            method1755(118);
        }
        class317 var2 = (class317) class90.field1246.method704((byte) 98, (long) arg1);
        field3884++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class116.field1767.method1287(arg1, 34, arg0 ^ 0xFFFFF6F6);
        class317 var4 = new class317();
        if (var3 != null) {
            var4.method2230(arg1, 0, new class44(var3));
        }
        class90.field1246.method703(var4, (long) arg1, (byte) 62);
        return var4;
    }

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "(I)V", line = 160)
    public final void method361(int arg0) {
        if (this.field3886 == null) {
            this.method1760(1, false);
        }
        this.method1756((byte) 104);
        field3894++;
        int var2 = -122 / ((arg0 - 42) / 36);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)[[I", line = 177)
    public final int[][] method62(byte arg0, int arg1) {
        field3892++;
        if (arg0 <= 121) {
            method1755(-99);
        }
        int[][] var3 = this.field4564.method1552(arg1, (byte) -69);
        if (this.field4564.field3529) {
            int[] var4 = this.method2048(0, (byte) 124, arg1);
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            for (int var8 = 0; var8 < class287.field4599; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field3893[var9];
                var7[var8] = client.method767(16711680, var10) >> 12;
                var5[var8] = client.method767(4080, var10 >> 4);
                var6[var8] = client.method767(var10 << 4, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "(I)V", line = 225)
    public static final void method1758(int arg0) {
        class80.field1117 = "Objet d'abonnés";
        class21.field308 = "compétence ";
        class57.field811 = "violet:";
        class282.field4536 = "Module texte chargé";
        class298.field4702 = "Liste des mises à jour chargée";
        class109.field1612 = "Gestionnaire de saisie chargé";
        if (arg0 != 2586) {
            method1755(-73);
        }
        class286.field4591 = " autres options";
        class196.field3194 = "Vérification des mises à jour - ";
        class274.field4422 = "Jeter";
        class46.field640 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class33.field446 = "Chargement en cours...";
        class108.field1598 = "Fichiers config chargés";
        class63.field918 = "Examiner";
        class282.field4532 = "Paramètres par défaut chargés";
        class120.field1827 = "Impossible de trouver ";
        class158.field2619 = "Veuillez patienter - tentative de rétablissement.";
        class27.field376 = "jaune:";
        class334.field5208 = "Textures chargées";
        class133.field2082 = "Atteindre";
        class109.field1613 = "niveau ";
        class252.field4028 = "ondulation:";
        field3895 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class116.field1762 = "Choisir une option";
        class64.field925 = "Utiliser";
        class287.field4594 = "Écran-titre ouvert";
        class116.field1766 = " est déjà dans votre liste noire.";
        class179.field2968 = "Interfaces chargées";
        class260.field4152 = "rouge:";
        class2.field32 = "Chargement de l'écran-titre - ";
        class284.field4541 = "Connexion perdue.";
        class32.field437 = "Caché";
        class190.field3115 = "ondulation2:";
        class146.field2276 = "Monde de jeu créé";
        class319.field4957 = "vert:";
        class169.field2786 = "Votre liste noire est pleine (100 noms maximum).";
        class94.field1288 = "Chargement des polices - ";
        class316.field4887 = " de votre liste noire.";
        class156.field2404 = "blanc:";
        class103.field1513 = " s'est connecté.";
        class185.field3066 = "Chargement des sprites - ";
        class187.field3086 = "glissement:";
        class168.field2778 = "cyan:";
        class117.field1776 = "déroulement:";
        class323.field5028 = "Regarder dans cette direction";
        class81.field1132 = "Annuler";
        class322.field4991 = "clignotant3:";
        class192.field3137 = "M";
        class127.field1992 = "Sprites chargés";
        class151.field2329 = "tremblement:";
        class103.field1509 = "Librairie 3D démarrée";
        class133.field2084 = "Chargement des interfaces - ";
        class289.field4640 = "Démarrage de la librairie 3D";
        class159.field2633 = "brillant1:";
        class259.field4149 = "Connecté au serveur de mise à jour";
        class280.field4522 = "Chargement des paramètres par défaut - ";
        class261.field4168 = "voudrait faire un échange avec vous.";
        class110.field1629 = " s'est déconnecté.";
        class23.field315 = "Veuillez commencer par supprimer ";
        class172.field2862 = "clignotant1:";
        class273.field4395 = "Continuer";
        class284.field4547 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class94.field1289 = " est déjà dans votre liste d'amis.";
        class97.field1383 = "classement ";
        class343.field5332 = " ";
        class106.field1575 = "Chargement des textures - ";
        class169.field2792 = " de votre liste d'amis.";
        class127.field1987 = "brillant2:";
        class58.field820 = "Poser";
        class287.field4592 = "Chargement des fichiers config - ";
        class66.field954 = "K";
        class127.field1980 = "Prendre";
        class338.field5273 = "Sélectionner";
        class221.field3550 = "Écran-titre chargé";
        class167.field2769 = "Chargement de la liste des serveurs";
        class341.field5312 = "Polices chargées";
        class212.field3473 = "Fermer";
        class55.field781 = "Moteur son préparé";
        class73.field1028 = "Chargement du module texte - ";
        class288.field4611 = "M";
        class261.field4172 = "Attaquer";
        class217.field3519 = "Chargement de RuneScape en cours - veuillez patienter...";
        class108.field1605 = "Chargement en cours. Veuillez patienter.";
        field3881++;
        class57.field794 = "Veuillez commencer par supprimer ";
        class298.field4707 = "Connexion au serveur de mise à jour en cours";
        class31.field411 = "OK";
        class330.field5087 = "K";
        class160.field2643 = "Liste des serveurs chargée";
        class32.field427 = "Mémoire attribuée";
        class304.field4776 = "clignotant2:";
        class164.field2735 = "Mémoire en cours d'attribution";
        class99.field1427 = "Veuillez patienter...";
        class55.field773 = "brillant3:";
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 563)
    public static final void method1759(Component arg0, byte arg1) {
        field3890++;
        arg0.addMouseListener(class63.field917);
        if (arg1 != 113) {
            method1758(-8);
        }
        arg0.addMouseMotionListener(class63.field917);
        arg0.addFocusListener(class63.field917);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZLjj;I)V", line = 582)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        field3879++;
        if (arg2 == 0) {
            int var4 = arg1.method286((byte) -64);
            if (var4 == 0) {
                this.field3886 = new int[arg1.method286((byte) -76)][4];
                for (int var5 = 0; var5 < this.field3886.length; var5++) {
                    this.field3886[var5][0] = arg1.method271(21081);
                    this.field3886[var5][1] = arg1.method286((byte) -68) << 4;
                    this.field3886[var5][2] = arg1.method286((byte) -111) << 4;
                    this.field3886[var5][3] = arg1.method286((byte) -91) << 4;
                }
            } else {
                this.method1760(var4, false);
            }
        }
        if (!arg0) {
            method1758(93);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)V", line = 620)
    private final void method1760(int arg0, boolean arg1) {
        field3885++;
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field3886 = new int[2][4];
                this.field3886[0][2] = 0;
                this.field3886[1][2] = 4096;
                this.field3886[0][0] = 0;
                this.field3886[0][3] = 0;
                this.field3886[0][1] = 0;
                this.field3886[1][1] = 4096;
                this.field3886[1][0] = 4096;
                this.field3886[1][3] = 4096;
            } else if (arg0 == 2) {
                this.field3886 = new int[8][4];
                this.field3886[0][1] = 2650;
                this.field3886[1][1] = 2313;
                this.field3886[0][0] = 0;
                this.field3886[1][0] = 2867;
                this.field3886[0][3] = 2361;
                this.field3886[2][0] = 3072;
                this.field3886[2][1] = 2618;
                this.field3886[3][0] = 3276;
                this.field3886[1][3] = 1558;
                this.field3886[2][3] = 1413;
                this.field3886[3][3] = 947;
                this.field3886[4][0] = 3481;
                this.field3886[0][2] = 2602;
                this.field3886[4][3] = 722;
                this.field3886[5][0] = 3686;
                this.field3886[3][1] = 2296;
                this.field3886[5][3] = 1766;
                this.field3886[6][3] = 915;
                this.field3886[4][1] = 2072;
                this.field3886[6][0] = 3891;
                this.field3886[7][3] = 1140;
                this.field3886[1][2] = 1799;
                this.field3886[2][2] = 1734;
                this.field3886[3][2] = 1220;
                this.field3886[7][0] = 4096;
                this.field3886[4][2] = 963;
                this.field3886[5][2] = 2152;
                this.field3886[6][2] = 1060;
                this.field3886[5][1] = 2730;
                this.field3886[6][1] = 2232;
                this.field3886[7][2] = 1413;
                this.field3886[7][1] = 1686;
            } else if (arg0 == 3) {
                this.field3886 = new int[7][4];
                this.field3886[0][1] = 0;
                this.field3886[0][2] = 0;
                this.field3886[0][3] = 4096;
                this.field3886[1][2] = 4096;
                this.field3886[2][2] = 4096;
                this.field3886[1][3] = 4096;
                this.field3886[1][1] = 0;
                this.field3886[3][2] = 4096;
                this.field3886[2][3] = 0;
                this.field3886[3][3] = 0;
                this.field3886[2][1] = 0;
                this.field3886[3][1] = 4096;
                this.field3886[0][0] = 0;
                this.field3886[4][1] = 4096;
                this.field3886[1][0] = 663;
                this.field3886[4][3] = 0;
                this.field3886[5][1] = 4096;
                this.field3886[2][0] = 1363;
                this.field3886[5][3] = 4096;
                this.field3886[6][1] = 0;
                this.field3886[4][2] = 0;
                this.field3886[5][2] = 0;
                this.field3886[3][0] = 2048;
                this.field3886[6][3] = 4096;
                this.field3886[4][0] = 2727;
                this.field3886[5][0] = 3411;
                this.field3886[6][0] = 4096;
                this.field3886[6][2] = 0;
            } else if (arg0 == 4) {
                this.field3886 = new int[6][4];
                this.field3886[0][3] = 0;
                this.field3886[0][2] = 0;
                this.field3886[1][2] = 0;
                this.field3886[0][0] = 0;
                this.field3886[1][0] = 1843;
                this.field3886[1][3] = 1493;
                this.field3886[0][1] = 0;
                this.field3886[1][1] = 0;
                this.field3886[2][2] = 0;
                this.field3886[3][2] = 1124;
                this.field3886[2][1] = 0;
                this.field3886[3][1] = 0;
                this.field3886[2][0] = 2457;
                this.field3886[3][0] = 2781;
                this.field3886[2][3] = 2939;
                this.field3886[4][2] = 3084;
                this.field3886[4][1] = 546;
                this.field3886[5][2] = 4096;
                this.field3886[3][3] = 3565;
                this.field3886[5][1] = 4096;
                this.field3886[4][3] = 4031;
                this.field3886[5][3] = 4096;
                this.field3886[4][0] = 3481;
                this.field3886[5][0] = 4096;
            } else if (arg0 == 5) {
                this.field3886 = new int[16][4];
                this.field3886[0][1] = 80;
                this.field3886[0][3] = 321;
                this.field3886[1][3] = 562;
                this.field3886[1][1] = 321;
                this.field3886[0][0] = 0;
                this.field3886[2][1] = 578;
                this.field3886[1][0] = 155;
                this.field3886[0][2] = 192;
                this.field3886[1][2] = 449;
                this.field3886[3][1] = 947;
                this.field3886[4][1] = 1285;
                this.field3886[2][3] = 803;
                this.field3886[2][0] = 389;
                this.field3886[3][3] = 1140;
                this.field3886[3][0] = 671;
                this.field3886[4][3] = 1509;
                this.field3886[2][2] = 690;
                this.field3886[3][2] = 995;
                this.field3886[5][3] = 1413;
                this.field3886[4][0] = 897;
                this.field3886[4][2] = 1397;
                this.field3886[5][1] = 1525;
                this.field3886[6][1] = 1734;
                this.field3886[5][0] = 1175;
                this.field3886[6][3] = 1333;
                this.field3886[7][1] = 1413;
                this.field3886[5][2] = 1429;
                this.field3886[6][0] = 1368;
                this.field3886[8][1] = 1108;
                this.field3886[9][1] = 1766;
                this.field3886[7][0] = 1507;
                this.field3886[10][1] = 2409;
                this.field3886[6][2] = 1461;
                this.field3886[11][1] = 3116;
                this.field3886[7][3] = 1702;
                this.field3886[8][0] = 1736;
                this.field3886[8][3] = 2056;
                this.field3886[9][0] = 2088;
                this.field3886[9][3] = 2666;
                this.field3886[12][1] = 3806;
                this.field3886[7][2] = 1525;
                this.field3886[10][0] = 2355;
                this.field3886[10][3] = 3276;
                this.field3886[13][1] = 3437;
                this.field3886[11][0] = 2691;
                this.field3886[12][0] = 3031;
                this.field3886[8][2] = 1590;
                this.field3886[11][3] = 3228;
                this.field3886[14][1] = 3116;
                this.field3886[12][3] = 3196;
                this.field3886[15][1] = 2377;
                this.field3886[13][3] = 3019;
                this.field3886[13][0] = 3522;
                this.field3886[9][2] = 2056;
                this.field3886[14][0] = 3727;
                this.field3886[14][3] = 3228;
                this.field3886[15][3] = 2746;
                this.field3886[10][2] = 2586;
                this.field3886[11][2] = 3148;
                this.field3886[15][0] = 4096;
                this.field3886[12][2] = 3710;
                this.field3886[13][2] = 3421;
                this.field3886[14][2] = 3148;
                this.field3886[15][2] = 2505;
            } else if (arg0 == 6) {
                this.field3886 = new int[4][4];
                this.field3886[0][3] = 0;
                this.field3886[0][0] = 2048;
                this.field3886[0][1] = 0;
                this.field3886[0][2] = 4096;
                this.field3886[1][2] = 4096;
                this.field3886[1][0] = 2867;
                this.field3886[2][0] = 3276;
                this.field3886[1][3] = 0;
                this.field3886[3][0] = 4096;
                this.field3886[2][2] = 4096;
                this.field3886[3][2] = 0;
                this.field3886[2][3] = 0;
                this.field3886[3][3] = 0;
                this.field3886[1][1] = 4096;
                this.field3886[2][1] = 4096;
                this.field3886[3][1] = 4096;
            } else {
                throw new RuntimeException("Invalid gradient preset");
            }
        }
        if (arg1) {
            field3878 = (class172) null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILjava/lang/String;)V", line = 886)
    public static final void method1761(int arg0, String arg1) {
        field3888++;
        int var2 = class172.method1274(-1, arg1);
        if (var2 != -1) {
            int var3 = 31 % ((arg0 + 33) / 42);
            int[] var4 = class225.field3604.method2086(class20.field289.field3269[var2] >> 14 & 0x3FFF, (byte) 108, class20.field289.field3269[var2] >> 28 & 0x3, class20.field289.field3269[var2] & 0x3FFF);
            class141.method1045(var4[2], -25697, var4[1]);
        }
    }
}
