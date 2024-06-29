import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class302 extends class16 {

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "I")
    private int field4714 = 2;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
    private int field4706 = 5;

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "[B")
    private byte[] field4709 = new byte[512];

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "I")
    private int field4710 = 0;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "I")
    private int field4705 = 1;

    @OriginalMember(owner = "client!oa", name = "cb", descriptor = "I")
    private int field4717 = 5;

    @OriginalMember(owner = "client!oa", name = "db", descriptor = "I")
    private int field4718 = 2048;

    @OriginalMember(owner = "client!oa", name = "hb", descriptor = "[S")
    private short[] field4722 = new short[512];

    @OriginalMember(owner = "client!oa", name = "eb", descriptor = "Ltl;")
    public static class222 field4719 = new class222(64);

    @OriginalMember(owner = "client!oa", name = "fb", descriptor = "D")
    public static double field4720 = -1.0D;

    @OriginalMember(owner = "client!oa", name = "jb", descriptor = "[I")
    public static int[] field4724 = new int[5];

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!oa", name = "W", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!oa", name = "ab", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!oa", name = "bb", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!oa", name = "gb", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!oa", name = "ib", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V", line = 9)
    public static final void method2109(boolean arg0) {
        class326.field5081 = "Écran-titre chargé";
        class102.field1559 = "voudrait faire un échange avec vous.";
        class224.field3567 = "Chargement de l'écran-titre - ";
        class236.field3743 = "violet:";
        class26.field378 = "Paramètres par défaut chargés";
        class188.field3060 = " de votre liste noire.";
        class246.field3919 = "brillant1:";
        class18.field238 = " est déjà dans votre liste noire.";
        class24.field341 = "Monde de jeu créé";
        class294.field4622 = "Chargement de RuneScape en cours - veuillez patienter...";
        class342.field5324 = "Liste des serveurs chargée";
        class291.field4593 = "Moteur son préparé";
        class46.field625 = "Liste des mises à jour chargée";
        class290.field4577 = "Votre liste noire est pleine (100 noms maximum).";
        class292.field4600 = "niveau ";
        class172.field2732 = "Prendre";
        class138.field2068 = "Utiliser";
        class250.field3983 = "Veuillez commencer par supprimer ";
        class266.field4200 = "ondulation2:";
        class164.field2671 = "Interfaces chargées";
        class140.field2091 = "blanc:";
        class309.field4831 = "Chargement en cours...";
        class91.field1407 = "Chargement du module texte - ";
        class18.field254 = "rouge:";
        class93.field1436 = "Fermer";
        field4711++;
        class330.field5150 = "brillant2:";
        class321.field5032 = "M";
        class79.field1191 = "Veuillez commencer par supprimer ";
        class305.field4758 = "Attaquer";
        class232.field3714 = "Polices chargées";
        class341.field5316 = "jaune:";
        class5.field56 = "Veuillez patienter - tentative de rétablissement.";
        class100.field1528 = "K";
        class77.field1169 = "Fichiers config chargés";
        class107.field1612 = " de votre liste d'amis.";
        class314.field4886 = "Gestionnaire de saisie chargé";
        class28.field401 = "Chargement des paramètres par défaut - ";
        class55.field730 = "clignotant1:";
        class17.field226 = "Regarder dans cette direction";
        class44.field598 = "Module texte chargé";
        class51.field697 = "Chargement des fichiers config - ";
        class193.field3170 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class105.field1588 = "Connexion perdue.";
        class249.field3955 = "Atteindre";
        class288.field4533 = "Chargement en cours. Veuillez patienter.";
        class242.field3847 = "Chargement des interfaces - ";
        class132.field1967 = "K";
        class179.field2896 = "Chargement de la liste des serveurs";
        class247.field3939 = "Objet d'abonnés";
        class93.field1441 = "Connecté au serveur de mise à jour";
        class287.field4529 = "classement ";
        class188.field3062 = "Choisir une option";
        class24.field343 = "Annuler";
        class103.field1581 = "Vérification des mises à jour - ";
        class93.field1435 = "Mémoire attribuée";
        class187.field3042 = " s'est connecté.";
        class173.field2748 = "Sélectionner";
        class253.field4026 = "Mémoire en cours d'attribution";
        class92.field1422 = "Jeter";
        class44.field607 = "glissement:";
        class331.field5153 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class260.field4147 = " s'est déconnecté.";
        class269.field4249 = "Librairie 3D démarrée";
        class37.field494 = "Chargement des textures - ";
        class325.field5077 = "Démarrage de la librairie 3D";
        class288.field4536 = "Sprites chargés";
        class98.field1491 = "Connexion au serveur de mise à jour en cours";
        class182.field2941 = "clignotant3:";
        class113.field1687 = "Textures chargées";
        class201.field3290 = " est déjà dans votre liste d'amis.";
        class173.field2768 = "Examiner";
        class191.field3093 = "déroulement:";
        if (!arg0) {
            return;
        }
        class277.field4384 = "clignotant2:";
        class68.field881 = "Veuillez patienter...";
        class84.field1277 = "Écran-titre ouvert";
        class255.field4048 = "OK";
        class329.field5132 = "M";
        class107.field1617 = "Poser";
        class37.field500 = " ";
        class3.field26 = "Chargement des sprites - ";
        class45.field619 = "Caché";
        class198.field3252 = "compétence ";
        class226.field3597 = "Continuer";
        class176.field2874 = "tremblement:";
        class86.field1310 = "Impossible de trouver ";
        class45.field621 = " autres options";
        class174.field2783 = "brillant3:";
        class222.field3543 = "vert:";
        class103.field1574 = "cyan:";
        class59.field784 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class98.field1496 = "Chargement des polices - ";
        class142.field2111 = "ondulation:";
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V", line = 346)
    public class302() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)V", line = 358)
    public final void method55(byte arg0) {
        this.field4709 = class251.method1776(-14422, this.field4710);
        field4716++;
        if (arg0 != 0) {
            field4724 = (int[]) null;
        }
        this.method2112((byte) -117);
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V", line = 375)
    public static void method2110(int arg0) {
        field4724 = null;
        if (arg0 < 119) {
            field4719 = (class222) null;
        }
        field4719 = null;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IB)Z", line = 387)
    public static final boolean method2111(int arg0, byte arg1) {
        field4713++;
        class331.field5159 = arg0 + 1 & 0xFFFF;
        class166.field2686 = true;
        if (arg1 < 60) {
            method2114(-81, (int[]) null, false, -89, (int[]) null);
        }
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(B)V", line = 409)
    private final void method2112(byte arg0) {
        Random var2 = new Random((long) this.field4710);
        if (arg0 != -117) {
            return;
        }
        this.field4722 = new short[512];
        field4708++;
        if (this.field4718 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field4722[var3] = (short) class66.method434(this.field4718, var2, -27852);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZI)V", line = 458)
    public static final void method2113(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (!arg4) {
            method2115((byte) 124);
        }
        for (int var6 = arg0; var6 <= arg0 + arg2; var6++) {
            for (int var7 = arg1; var7 <= (arg1 + arg5); var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class100.field1520[arg3][var7][var6] = 127;
                }
            }
        }
        field4721++;
        for (int var8 = arg0; var8 < arg0 + arg2; var8++) {
            for (int var9 = arg1; var9 < (arg1 + arg5); var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class84.field1282[arg3][var9][var8] = arg3 <= 0 ? 0 : class84.field1282[arg3 - 1][var9][var8];
                }
            }
        }
        if (arg1 > 0 && arg1 < 104) {
            for (int var10 = arg0 + 1; var10 < arg0 + arg2; var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class84.field1282[arg3][arg1][var10] = class84.field1282[arg3][arg1 - 1][var10];
                }
            }
        }
        if (arg0 > 0 && arg0 < 104) {
            for (int var11 = arg1 + 1; var11 < (arg1 + arg5); var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class84.field1282[arg3][var11][arg0] = class84.field1282[arg3][var11][arg0 - 1];
                }
            }
        }
        if (arg1 < 0 || arg0 < 0 || arg1 >= 104 || arg0 >= 104) {
            return;
        }
        if (arg3 == 0) {
            if (arg1 > 0 && class84.field1282[arg3][arg1 - 1][arg0] != 0) {
                class84.field1282[arg3][arg1][arg0] = class84.field1282[arg3][arg1 - 1][arg0];
            } else if (arg0 > 0 && class84.field1282[arg3][arg1][arg0 - 1] != 0) {
                class84.field1282[arg3][arg1][arg0] = class84.field1282[arg3][arg1][arg0 - 1];
            } else if (arg1 > 0 && arg0 > 0 && class84.field1282[arg3][arg1 - 1][arg0 - 1] != 0) {
                class84.field1282[arg3][arg1][arg0] = class84.field1282[arg3][arg1 - 1][arg0 - 1];
            }
        } else if (arg1 > 0 && class84.field1282[arg3][arg1 - 1][arg0] != class84.field1282[arg3 - 1][arg1 - 1][arg0]) {
            class84.field1282[arg3][arg1][arg0] = class84.field1282[arg3][arg1 - 1][arg0];
        } else if (arg0 > 0 && class84.field1282[arg3 - 1][arg1][arg0 - 1] != class84.field1282[arg3][arg1][arg0 - 1]) {
            class84.field1282[arg3][arg1][arg0] = class84.field1282[arg3][arg1][arg0 - 1];
        } else if (arg1 > 0 && arg0 > 0 && class84.field1282[arg3 - 1][arg1 - 1][arg0 - 1] != class84.field1282[arg3][arg1 - 1][arg0 - 1]) {
            class84.field1282[arg3][arg1][arg0] = class84.field1282[arg3][arg1 - 1][arg0 - 1];
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(ZI)[I", line = 586)
    public final int[] method8(boolean arg0, int arg1) {
        if (!arg0) {
            field4724 = (int[]) null;
        }
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        field4723++;
        if (this.field207.field4024) {
            int var4 = class130.field1921[arg1] * this.field4717 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class276.field4376; var7++) {
                class323.field5052 = Integer.MAX_VALUE;
                class60.field787 = Integer.MAX_VALUE;
                class237.field3752 = Integer.MAX_VALUE;
                class36.field475 = Integer.MAX_VALUE;
                int var8 = class27.field396[var7] * this.field4706 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field4709[(this.field4717 <= var11 ? var11 - this.field4717 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field4709[(this.field4706 > var13 ? var13 : var13 - this.field4706) + var12 & 0xFF] & 0xFF) * 2;
                        int var10000 = var8 - (var13 << 12);
                        int var27 = var14 + 1;
                        int var15 = var10000 - this.field4722[var14];
                        int var16 = var4 - (var11 << 12) - this.field4722[var27];
                        int var17 = this.field4705;
                        int var20;
                        if (var17 == 1) {
                            var20 = var15 * var15 + (var16 * var16) >> 12;
                        } else if (var17 == 3) {
                            int var18 = var15 < 0 ? -var15 : var15;
                            int var19 = var16 < 0 ? -var16 : var16;
                            var20 = var19 < var18 ? var18 : var19;
                        } else if (var17 == 4) {
                            int var21 = (int) (Math.sqrt((double) ((float) (var15 < 0 ? -var15 : var15) / 4096.0F)) * 4096.0D);
                            int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                            int var23 = var21 + var22;
                            var20 = var23 * var23 >> 12;
                        } else if (var17 == 5) {
                            int var24 = var15 * var15;
                            int var25 = var16 * var16;
                            var20 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var24 + var25) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var20 = (var16 >= 0 ? var16 : -var16) + (var15 >= 0 ? var15 : -var15);
                        } else {
                            var20 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (class36.field475 > var20) {
                            class323.field5052 = class60.field787;
                            class60.field787 = class237.field3752;
                            class237.field3752 = class36.field475;
                            class36.field475 = var20;
                        } else if (class237.field3752 > var20) {
                            class323.field5052 = class60.field787;
                            class60.field787 = class237.field3752;
                            class237.field3752 = var20;
                        } else if (var20 < class60.field787) {
                            class323.field5052 = class60.field787;
                            class60.field787 = var20;
                        } else if (class323.field5052 > var20) {
                            class323.field5052 = var20;
                        }
                    }
                }
                int var26 = this.field4714;
                if (var26 == 0) {
                    var3[var7] = class36.field475;
                } else if (var26 == 1) {
                    var3[var7] = class237.field3752;
                } else if (var26 == 3) {
                    var3[var7] = class60.field787;
                } else if (var26 == 4) {
                    var3[var7] = class323.field5052;
                } else if (var26 == 2) {
                    var3[var7] = class237.field3752 - class36.field475;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[IZI[I)V", line = 791)
    public static final void method2114(int arg0, int[] arg1, boolean arg2, int arg3, int[] arg4) {
        if (arg2) {
            field4724 = (int[]) null;
        }
        if (arg3 > arg0) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var6;
            int var7 = arg0;
            int var8 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var8;
            for (int var9 = arg0; var9 < arg3; var9++) {
                if (arg4[var9] > var6 + (var9 & 0x1)) {
                    int var10 = arg4[var9];
                    arg4[var9] = arg4[var7];
                    arg4[var7] = var10;
                    int var11 = arg1[var9];
                    arg1[var9] = arg1[var7];
                    arg1[var7++] = var11;
                }
            }
            arg4[arg3] = arg4[var7];
            arg4[var7] = var6;
            arg1[arg3] = arg1[var7];
            arg1[var7] = var8;
            method2114(arg0, arg1, false, var7 - 1, arg4);
            method2114(var7 + 1, arg1, false, arg3, arg4);
        }
        field4712++;
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(B)Ln;", line = 849)
    public static final class298 method2115(byte arg0) {
        field4707++;
        int var1 = class244.field3885[0] * class21.field316[0];
        byte[] var2 = class3.field20[0];
        class298 var6;
        if (class181.field2927[0]) {
            byte[] var3 = class269.field4251[0];
            int[] var4 = new int[var1];
            for (int var5 = 0; var5 < var1; var5++) {
                var4[var5] = class24.method149(class305.field4754[class200.method1465(var2[var5], 255)], class200.method1465(var3[var5], 255) << 24);
            }
            var6 = new class82(class163.field2659, class113.field1698, class163.field2657[0], class162.field2647[0], class244.field3885[0], class21.field316[0], var4);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class305.field4754[class200.method1465(255, var2[var8])];
            }
            var6 = new class298(class163.field2659, class113.field1698, class163.field2657[0], class162.field2647[0], class244.field3885[0], class21.field316[0], var7);
        }
        class17.method115((byte) 83);
        if (arg0 < 39) {
            method2111(-54, (byte) 68);
        }
        return var6;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLim;I)V", line = 900)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        if (arg0 != -7) {
            return;
        }
        if (arg2 == 0) {
            this.field4706 = this.field4717 = arg1.method1399(arg0 ^ 0x45E13F91);
        } else if (arg2 == 1) {
            this.field4710 = arg1.method1399(arg0 ^ 0x45E13F91);
        } else if (arg2 == 2) {
            this.field4718 = arg1.method1396(arg0 ^ 0x41);
        } else if (arg2 == 3) {
            this.field4714 = arg1.method1399(-1172389784);
        } else if (arg2 == 4) {
            this.field4705 = arg1.method1399(-1172389784);
        } else if (arg2 == 5) {
            this.field4706 = arg1.method1399(-1172389784);
        } else if (arg2 == 6) {
            this.field4717 = arg1.method1399(-1172389784);
        }
        field4715++;
    }
}
