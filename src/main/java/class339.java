import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class339 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "[I")
    public static int[] field5238 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field5234 = -1;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "[I")
    public static int[] field5240 = new int[25];

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public static int field5242 = 0;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "[C")
    public static char[] field5241 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "Lpk;")
    public static class120 field5239;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "[Lwd;")
    public static class88[] field5229;

    @OriginalMember(owner = "client!ef", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 6)
    public final void keyTyped(KeyEvent arg0) {
        if (class24.field411 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class39.method341(var2, 109)) {
                int var3 = class171.field2748 + 1 & 0x7F;
                if (class110.field1790 != var3) {
                    class200.field3069[class171.field2748] = -1;
                    class208.field3285[class171.field2748] = var2;
                    class171.field2748 = var3;
                }
            }
        }
        field5230++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!ef", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 47)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class24.field411 != null) {
            class321.field5030 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class117.field1893.length) {
                var3 = class117.field1893[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class175.field2805 >= 0 && var3 >= 0) {
                class284.field4438[class175.field2805] = ~var3;
                class175.field2805 = class175.field2805 + 1 & 0x7F;
                if (class78.field1224 == class175.field2805) {
                    class175.field2805 = -1;
                }
            }
        }
        field5232++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!ef", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 79)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class24.field411 != null) {
            class175.field2805 = -1;
        }
        field5228++;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 96)
    public static void method2351(int arg0) {
        if (arg0 > -53) {
            method2351(52);
        }
        field5229 = null;
        field5240 = null;
        field5241 = null;
        field5239 = null;
        field5238 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V", line = 110)
    public static final void method2352(int arg0, int arg1) {
        class66.field979.method2285(arg0, (byte) 98);
        field5237++;
        int var2 = -16 % ((-arg1 - 33) / 51);
    }

    @OriginalMember(owner = "client!ef", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 120)
    public final void focusGained(FocusEvent arg0) {
        field5235++;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V", line = 136)
    public static final void method2353(int arg0) {
        class280.field4379 = "Écran-titre ouvert";
        class120.field1971 = "Connexion perdue.";
        class93.field1521 = "Chargement des fichiers config - ";
        class37.field551 = " de votre liste noire.";
        class164.field2671 = "Annuler";
        class320.field5016 = "Sprites chargés";
        class136.field2216 = "Connexion au serveur de mise à jour en cours";
        class185.field2934 = "déroulement:";
        class135.field2165 = "cyan:";
        class165.field2674 = "Chargement du module texte - ";
        int var1 = -56 % ((arg0 + 11) / 54);
        class174.field2797 = "Mémoire attribuée";
        class225.field3482 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class34.field513 = "clignotant2:";
        class90.field1434 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class333.field5190 = "Fichiers config chargés";
        class155.field2514 = "K";
        class47.field727 = "Poser";
        class160.field2602 = "ondulation:";
        class155.field2544 = "M";
        class318.field4997 = " s'est connecté.";
        class18.field343 = "Impossible de trouver ";
        class280.field4386 = "Liste des mises à jour chargée";
        class58.field876 = " ";
        class109.field1771 = "compétence ";
        class325.field5082 = "Veuillez patienter...";
        class11.field257 = "Veuillez commencer par supprimer ";
        class180.field2870 = " est déjà dans votre liste d'amis.";
        class18.field342 = "Examiner";
        class244.field3655 = "Chargement en cours. Veuillez patienter.";
        class320.field5014 = "Chargement de la liste des serveurs";
        class338.field5223 = "ondulation2:";
        class76.field1191 = "Chargement des sprites - ";
        class201.field3126 = " autres options";
        class220.field3436 = "clignotant1:";
        class24.field418 = "violet:";
        class112.field1814 = "Module texte chargé";
        class303.field4833 = "Gestionnaire de saisie chargé";
        class243.field3637 = "Chargement des textures - ";
        class338.field5221 = "tremblement:";
        class281.field4411 = "Fermer";
        class328.field5125 = "Librairie 3D démarrée";
        class285.field4452 = "Mémoire en cours d'attribution";
        class4.field111 = "rouge:";
        class147.field2419 = "Prendre";
        class200.field3071 = "Moteur son préparé";
        class207.field3273 = "Chargement de l'écran-titre - ";
        class84.field1329 = "Atteindre";
        class320.field5012 = "Démarrage de la librairie 3D";
        class68.field1033 = "Attaquer";
        class135.field2161 = "M";
        class195.field3020 = "Continuer";
        class116.field1886 = "clignotant3:";
        class91.field1473 = "Vérification des mises à jour - ";
        class308.field4883 = "Textures chargées";
        class334.field5199 = "Objet d'abonnés";
        class266.field4022 = "Jeter";
        class137.field2238 = " de votre liste d'amis.";
        class204.field3178 = " est déjà dans votre liste noire.";
        class296.field4736 = "Paramètres par défaut chargés";
        class110.field1788 = " s'est déconnecté.";
        class154.field2508 = "blanc:";
        class63.field915 = "niveau ";
        class73.field1111 = "classement ";
        class253.field3729 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class266.field3997 = "Interfaces chargées";
        class233.field3544 = "Liste des serveurs chargée";
        class173.field2774 = "jaune:";
        class149.field2437 = "Sélectionner";
        class204.field3179 = "K";
        class179.field2857 = "brillant1:";
        class112.field1815 = "Chargement des paramètres par défaut - ";
        class197.field3036 = "Regarder dans cette direction";
        class86.field1382 = "vert:";
        class213.field3332 = "OK";
        class245.field3659 = "Votre liste noire est pleine (100 noms maximum).";
        class113.field1831 = "voudrait faire un échange avec vous.";
        class328.field5132 = "Chargement des interfaces - ";
        class340.field5249 = "Chargement en cours...";
        class307.field4872 = "Choisir une option";
        class318.field4995 = "glissement:";
        class121.field1979 = "brillant3:";
        class183.field2901 = "Veuillez commencer par supprimer ";
        class184.field2922 = "Veuillez patienter - tentative de rétablissement.";
        class111.field1803 = "Chargement de RuneScape en cours - veuillez patienter...";
        class299.field4780 = "Monde de jeu créé";
        class157.field2568 = "Polices chargées";
        class337.field5210 = "brillant2:";
        class76.field1166 = "Écran-titre chargé";
        field5233++;
        class93.field1522 = "Utiliser";
        class220.field3437 = "Connecté au serveur de mise à jour";
        class118.field1914 = "Chargement des polices - ";
        class220.field3438 = "Caché";
    }

    @OriginalMember(owner = "client!ef", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 484)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field5236++;
        if (class24.field411 == null) {
            return;
        }
        class321.field5030 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class117.field1893.length > var2) {
            var3 = class117.field1893[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class175.field2805 >= 0 && var3 >= 0) {
            class284.field4438[class175.field2805] = var3;
            class175.field2805 = class175.field2805 + 1 & 0x7F;
            if (class78.field1224 == class175.field2805) {
                class175.field2805 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class171.field2748 + 1 & 0x7F;
            if (class110.field1790 != var4) {
                class200.field3069[class171.field2748] = var3;
                class208.field3285[class171.field2748] = '\u0000';
                class171.field2748 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }
}
