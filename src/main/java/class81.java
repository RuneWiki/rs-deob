import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class81 extends class273 {

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "I")
    private int field1200 = 4096;

    @OriginalMember(owner = "client!q", name = "J", descriptor = "[[B")
    public static byte[][] field1194 = new byte[250][];

    @OriginalMember(owner = "client!q", name = "U", descriptor = "[Llf;")
    public static class68[] field1204 = new class68[8];

    @OriginalMember(owner = "client!q", name = "P", descriptor = "I")
    public static int field1199 = 0;

    @OriginalMember(owner = "client!q", name = "V", descriptor = "[J")
    public static long[] field1205 = new long[200];

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "I")
    public static int field1208 = 0;

    @OriginalMember(owner = "client!q", name = "L", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!q", name = "M", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!q", name = "O", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!q", name = "S", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!q", name = "T", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!q", name = "W", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!q", name = "X", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!q", name = "R", descriptor = "Lwf;")
    public static class306 field1201;

    @OriginalMember(owner = "client!q", name = "N", descriptor = "[Ln;")
    public static class178[] field1197;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "(I)V", line = 6)
    public static final void method555(int arg0) {
        field1206++;
        class200.field3009++;
        class265.field4095.method2064(255, 165);
        class265.field4095.method2044(1247686728, class166.field2558);
        if (arg0 != 0) {
            method559(false);
        }
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(B)V", line = 19)
    public static void method556(byte arg0) {
        if (arg0 > -29) {
            return;
        }
        field1205 = null;
        field1197 = null;
        field1201 = null;
        field1194 = (byte[][]) null;
        field1204 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BILgn;)V", line = 33)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        field1207++;
        if (arg1 == 0) {
            this.field1200 = arg2.method1994(false);
        }
        if (arg0 <= 27) {
            method556((byte) 62);
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V", line = 46)
    public class81() {
        super(1, true);
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(IB)Lwd;", line = 63)
    public static final class232 method557(int arg0, byte arg1) {
        field1198++;
        class232 var2 = (class232) class68.field1023.method1294((long) arg0, 122);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 107) {
            field1199 = 9;
        }
        byte[] var3 = class143.field2275.method2103(0, arg0, 0);
        class232 var4 = new class232(var3);
        var4.method1232(class192.field2904, (int[]) null);
        class68.field1023.method1292((long) arg0, -112, var4);
        return var4;
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(B)Z", line = 90)
    public static final boolean method558(byte arg0) {
        int var1 = -81 / ((-arg0 - 45) / 34);
        field1196++;
        try {
            return class151.method1061((byte) -103);
        } catch (IOException var6) {
            class330.method2232(104);
            return true;
        } catch (Exception var7) {
            String var4 = "T2 - " + class93.field1441 + "," + class338.field5230 + "," + class6.field69 + " - " + class85.field1284 + "," + (class30.field374 + class79.field1173.field476[0]) + "," + (class79.field1173.field505[0] + class294.field4535) + " - ";
            for (int var5 = 0; var5 < class85.field1284 && var5 < 50; var5++) {
                var4 = var4 + class230.field3713.field4716[var5] + ",";
            }
            class291.method1892(var4, var7, -2);
            class173.method1177((byte) -74);
            return true;
        }
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(Z)Lgn;", line = 117)
    public static final class303 method559(boolean arg0) {
        field1202++;
        if (!arg0) {
            return (class303) null;
        }
        class303 var1 = new class303(34);
        var1.method2034(-23, 11);
        var1.method2034(-59, class88.field1322);
        var1.method2034(-53, class82.field1226 ? 1 : 0);
        var1.method2034(-81, class233.field3752 ? 1 : 0);
        var1.method2034(-127, class317.field4985 ? 1 : 0);
        var1.method2034(-22, class275.field4239 ? 1 : 0);
        var1.method2034(-32, class188.field2856 ? 1 : 0);
        var1.method2034(-123, class318.field4986 ? 1 : 0);
        var1.method2034(-101, class124.field1935 ? 1 : 0);
        var1.method2034(-120, class155.field2434 ? 1 : 0);
        var1.method2034(-32, class90.field1382);
        var1.method2034(-31, class192.field2903 ? 1 : 0);
        var1.method2034(-13, class297.field4556 ? 1 : 0);
        var1.method2034(-108, class187.field2843 ? 1 : 0);
        var1.method2034(-91, class160.field2490);
        var1.method2034(-90, class269.field4148 ? 1 : 0);
        var1.method2034(-116, class34.field441);
        var1.method2034(-41, class334.field5199);
        var1.method2034(-8, class274.field4219);
        var1.method2044(1247686728, class226.field3605);
        var1.method2044(1247686728, class10.field99);
        var1.method2034(-4, class243.method1654());
        var1.method2013(class99.field1539, -125);
        var1.method2034(-3, class175.field2682);
        var1.method2034(-67, class315.field4962 ? 1 : 0);
        var1.method2034(-14, class298.field4569 ? 1 : 0);
        var1.method2034(-106, class338.field5235);
        var1.method2034(-111, class268.field4135 ? 1 : 0);
        var1.method2034(-56, class104.field1609 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(Z)V", line = 167)
    public static final void method560(boolean arg0) {
        class26.field340 = "Chargement des polices - ";
        class332.field5137 = " de votre liste noire.";
        class136.field2110 = "clignotant1:";
        class133.field2101 = "ondulation:";
        class15.field157 = " autres options";
        class246.field3855 = "Fermer";
        class170.field2589 = "ondulation2:";
        class187.field2842 = "Veuillez commencer par supprimer ";
        class130.field2027 = "Textures chargées";
        class40.field573 = "Gestionnaire de saisie chargé";
        class285.field4373 = "Écran-titre chargé";
        field1195++;
        class203.field3062 = "Sélectionner";
        class24.field303 = "Chargement des textures - ";
        class82.field1217 = "Utiliser";
        class334.field5190 = "Connexion au serveur de mise à jour en cours";
        class306.field4801 = "Atteindre";
        class154.field2416 = "Paramètres par défaut chargés";
        class174.field2642 = "clignotant3:";
        class107.field1644 = "brillant1:";
        class330.field5099 = "Monde de jeu créé";
        class132.field2090 = "Votre liste noire est pleine (100 noms maximum).";
        class108.field1670 = "Chargement en cours...";
        class106.field1622 = "Mémoire attribuée";
        class233.field3749 = "tremblement:";
        class255.field3991 = "Sprites chargés";
        class152.field2411 = " s'est déconnecté.";
        class307.field4835 = "Veuillez commencer par supprimer ";
        class40.field572 = "jaune:";
        class93.field1436 = "M";
        class105.field1613 = "déroulement:";
        class229.field3688 = "voudrait faire un échange avec vous.";
        class150.field2366 = "Chargement des fichiers config - ";
        class82.field1244 = "Chargement du module texte - ";
        class305.field4768 = "brillant2:";
        class35.field450 = " de votre liste d'amis.";
        class26.field338 = "Chargement de l'écran-titre - ";
        class177.field2693 = " s'est connecté.";
        class330.field5114 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class200.field3016 = "Chargement en cours. Veuillez patienter.";
        class161.field2498 = "clignotant2:";
        class177.field2712 = "Poser";
        class124.field1936 = "vert:";
        class29.field363 = "Chargement des sprites - ";
        class164.field2530 = "Veuillez patienter...";
        class220.field3498 = "Continuer";
        class231.field3726 = "compétence ";
        class266.field4102 = "Démarrage de la librairie 3D";
        class228.field3657 = "Caché";
        class332.field5141 = "Librairie 3D démarrée";
        class84.field1280 = "Fichiers config chargés";
        class51.field730 = "brillant3:";
        class110.field1701 = "Connecté au serveur de mise à jour";
        class329.field5088 = "Chargement des interfaces - ";
        class79.field1176 = "Annuler";
        class77.field1149 = "OK";
        class125.field1950 = "Polices chargées";
        class190.field2892 = " est déjà dans votre liste d'amis.";
        class106.field1628 = "K";
        class27.field353 = "classement ";
        class51.field731 = "Liste des serveurs chargée";
        class282.field4330 = "Liste des mises à jour chargée";
        class309.field4859 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class155.field2438 = "blanc:";
        class231.field3723 = "Objet d'abonnés";
        class190.field2899 = "rouge:";
        class293.field4511 = "Attaquer";
        class247.field3885 = "Vérification des mises à jour - ";
        class304.field4751 = "Chargement des paramètres par défaut - ";
        class259.field4028 = "Chargement de RuneScape en cours - veuillez patienter...";
        class294.field4542 = "K";
        class317.field4982 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class264.field4066 = "glissement:";
        class89.field1357 = "cyan:";
        class275.field4240 = " est déjà dans votre liste noire.";
        class69.field1028 = "Veuillez patienter - tentative de rétablissement.";
        class3.field29 = "Écran-titre ouvert";
        class280.field4326 = "Examiner";
        if (arg0) {
            method556((byte) -34);
        }
        class169.field2580 = "Interfaces chargées";
        class125.field1951 = "Prendre";
        class143.field2265 = "Mémoire en cours d'attribution";
        class23.field287 = "violet:";
        class123.field1924 = "Impossible de trouver ";
        class334.field5201 = "Jeter";
        class185.field2832 = "niveau ";
        class338.field5231 = "Moteur son préparé";
        class158.field2465 = "M";
        class82.field1224 = "Choisir une option";
        class262.field4055 = "Chargement de la liste des serveurs";
        class282.field4336 = "Regarder dans cette direction";
        class299.field4641 = " ";
        class205.field3093 = "Module texte chargé";
        class23.field297 = "Connexion perdue.";
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)[I", line = 512)
    public final int[] method331(int arg0, int arg1) {
        field1203++;
        if (arg1 != -14650) {
            this.field1200 = -127;
        }
        int[] var3 = this.field4204.method365(arg0, arg1 + 14650);
        if (this.field4204.field792) {
            int[] var4 = this.method1790(0, class117.field1819 & arg0 - 1, 0);
            int[] var5 = this.method1790(0, arg0, 0);
            int[] var6 = this.method1790(0, class117.field1819 & arg0 + 1, 0);
            for (int var7 = 0; var7 < class27.field346; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field1200;
                int var9 = (var5[class197.field2963 & var7 + 1] - var5[class197.field2963 & var7 - 1]) * this.field1200;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }
}
