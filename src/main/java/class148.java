import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class148 extends class254 {

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "[B")
    public byte[] field2108;

    @OriginalMember(owner = "client!vk", name = "t", descriptor = "I")
    public static int field2111 = -1;

    @OriginalMember(owner = "client!vk", name = "y", descriptor = "I")
    public static int field2116 = -1;

    @OriginalMember(owner = "client!vk", name = "u", descriptor = "I")
    public static int field2112 = 0;

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "Z")
    public static boolean field2109 = false;

    @OriginalMember(owner = "client!vk", name = "C", descriptor = "I")
    public static int field2119 = 0;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!vk", name = "v", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!vk", name = "w", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!vk", name = "x", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!vk", name = "A", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!vk", name = "D", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V")
    public static final void method987(byte arg0) {
        field2107++;
        if (arg0 > -40) {
            return;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class14.field215[var1] = false;
        }
        class247.field3701 = -1;
        class261.field3936 = -1;
        class68.field1069 = 1;
        class55.field839 = 0;
        class179.field2549 = 0;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "([B)V")
    public class148(byte[] arg0) {
        this.field2108 = arg0;
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)V")
    public static final void method988(int arg0) {
        if (arg0 != -10629) {
            method992(-117, (class233) null);
        }
        class211.method1345();
        field2110++;
        for (int var1 = 0; var1 < 4; var1++) {
            class246.field3681[var1].method583(16777216);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)V")
    public static final void method989(int arg0) {
        class67.field1039 = "brillant2:";
        if (arg0 > -71) {
            method988(96);
        }
        class94.field1437 = "Regarder dans cette direction";
        class33.field478 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class183.field2607 = "Prendre";
        class66.field1034 = "K";
        class23.field309 = "Mémoire en cours d'attribution";
        class84.field1306 = "Veuillez commencer par supprimer ";
        class58.field895 = "Chargement de la liste des serveurs";
        class179.field2553 = "Jeter";
        class55.field846 = "Connexion perdue.";
        class181.field2598 = "Chargement de RuneScape en cours - veuillez patienter...";
        class135.field1955 = "Continuer";
        class194.field2795 = "Écran-titre ouvert";
        class163.field2375 = " de votre liste d'amis.";
        field2118++;
        class182.field2603 = "niveau ";
        class235.field3541 = "Veuillez patienter...";
        class221.field3281 = "voudrait faire un échange avec vous.";
        class123.field1781 = "Polices chargées";
        class47.field662 = "OK";
        class168.field2435 = "clignotant3:";
        class227.field3408 = "ondulation2:";
        class152.field2203 = "blanc:";
        class280.field4474 = "K";
        class183.field2617 = "Objet d'abonnés";
        class42.field611 = "Chargement des interfaces - ";
        class16.field232 = "Liste des serveurs chargée";
        class147.field2105 = "déroulement:";
        class237.field3566 = "jaune:";
        class124.field1802 = "Caché";
        class51.field746 = "Monde de jeu créé";
        class56.field849 = "brillant1:";
        class237.field3569 = "rouge:";
        class47.field661 = "cyan:";
        class166.field2424 = "Interfaces chargées";
        class75.field1169 = "classement ";
        class221.field3280 = " s'est déconnecté.";
        class1.field16 = "Attaquer";
        class40.field594 = "compétence ";
        class43.field627 = "Moteur son préparé";
        class86.field1333 = "Chargement en cours. Veuillez patienter.";
        class240.field3609 = "Utiliser";
        class227.field3409 = "Veuillez patienter - tentative de rétablissement.";
        class197.field2847 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class248.field3722 = "Vérification des mises à jour - ";
        class101.field1509 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class26.field358 = " s'est connecté.";
        class273.field4341 = "Mémoire attribuée";
        class80.field1238 = "Écran-titre chargé";
        class267.field4067 = " est déjà dans votre liste d'amis.";
        class124.field1805 = "tremblement:";
        class163.field2366 = "Librairie 3D démarrée";
        class10.field169 = " de votre liste noire.";
        class110.field1591 = "Chargement des polices - ";
        class78.field1209 = "Connecté au serveur de mise à jour";
        class184.field2626 = "M";
        class48.field707 = "Veuillez commencer par supprimer ";
        class89.field1358 = "glissement:";
        class96.field1454 = "Impossible de trouver ";
        class109.field1570 = "brillant3:";
        class194.field2787 = "Chargement du module texte - ";
        class203.field2942 = "Textures chargées";
        class55.field830 = "Examiner";
        class38.field564 = "Poser";
        class48.field697 = "Sprites chargés";
        class155.field2263 = "Démarrage de la librairie 3D";
        class13.field208 = "Gestionnaire de saisie chargé";
        class70.field1096 = "Sélectionner";
        class124.field1809 = "Chargement des fichiers config - ";
        class176.field2504 = "Chargement de l'écran-titre - ";
        class260.field3926 = "Fermer";
        class140.field2027 = "Connexion au serveur de mise à jour en cours";
        class91.field1385 = "Chargement des textures - ";
        class130.field1900 = " est déjà dans votre liste noire.";
        class39.field586 = "Module texte chargé";
        class253.field3848 = "Choisir une option";
        class55.field845 = "M";
        class1.field15 = "clignotant1:";
        class273.field4329 = "ondulation:";
        class123.field1784 = "Fichiers config chargés";
        class263.field3966 = "vert:";
        class72.field1116 = "Chargement des sprites - ";
        class158.field2287 = "Atteindre";
        class99.field1481 = " autres options";
        class52.field760 = "clignotant2:";
        class109.field1572 = "Votre liste noire est pleine (100 noms maximum).";
        class284.field4516 = "Chargement en cours...";
        class56.field857 = "violet:";
        class233.field3503 = "Annuler";
        class262.field3946 = "Liste des mises à jour chargée";
        class20.field272 = " ";
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIB)V")
    public static final void method990(int arg0, int arg1, byte arg2) {
        field2114++;
        class270 var3 = class190.method1213(25702, arg1, 1);
        var3.method1808((byte) 62);
        int var4 = 106 % ((arg2 - 42) / 56);
        var3.field4226 = arg0;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(B)Lih;")
    public static final class28 method991(byte arg0) {
        field2120++;
        try {
            if (arg0 != -86) {
                method989(72);
            }
            return (class28) Class.forName("gl").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class194();
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILve;)V")
    public static final void method992(int arg0, class233 arg1) {
        field2117++;
        if (arg0 <= -60) {
            class162.field2344 = arg1;
        }
    }
}
