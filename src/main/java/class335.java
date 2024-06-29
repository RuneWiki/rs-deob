import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class335 {

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "Lnh;")
    private class247 field5213;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Lff;")
    private class214 field5209;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "Lmk;")
    private class329 field5216;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field5204 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "[I")
    public static int[] field5214 = new int[1000];

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "Lgn;")
    private class303 field5218;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "[Lu;")
    private class253[] field5212;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZILch;Lch;)Lu;", line = 4)
    public final class253 method2328(boolean arg0, int arg1, class33 arg2, class33 arg3) {
        if (arg0) {
            this.method2335(27);
        }
        field5210++;
        return this.method2331(arg2, arg1, arg3, true, -123);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V", line = 23)
    public static void method2329(byte arg0) {
        int var1 = -102 % ((52 - arg0) / 42);
        field5214 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)Z", line = 31)
    public final boolean method2330(int arg0) {
        field5211++;
        if (this.field5218 != null) {
            return true;
        }
        if (this.field5216 == null) {
            if (this.field5213.method1682(125)) {
                return false;
            }
            this.field5216 = this.field5213.method1669(true, 255, (byte) 114, 255, (byte) 0);
        }
        if (this.field5216.field2528) {
            return false;
        }
        if (arg0 != 255) {
            this.method2331((class33) null, -72, (class33) null, true, 33);
        }
        this.field5218 = new class303(this.field5216.method992(-111));
        this.field5212 = new class253[(this.field5218.field4716.length - 5) / 8];
        return true;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lch;ILch;ZI)Lu;", line = 60)
    private final class253 method2331(class33 arg0, int arg1, class33 arg2, boolean arg3, int arg4) {
        if (arg4 >= -117) {
            method2332((Component) null, (byte) 0);
        }
        field5205++;
        if (this.field5218 == null) {
            throw new RuntimeException();
        }
        this.field5218.field4679 = arg1 * 8 + 5;
        if (this.field5218.field4679 >= this.field5218.field4716.length) {
            throw new RuntimeException();
        } else if (this.field5212[arg1] == null) {
            int var6 = this.field5218.method1996(-99);
            int var7 = this.field5218.method1996(44);
            class253 var8 = new class253(arg1, arg0, arg2, this.field5213, this.field5209, var6, var7, arg3);
            this.field5212[arg1] = var8;
            return var8;
        } else {
            return this.field5212[arg1];
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 102)
    public static final void method2332(Component arg0, byte arg1) {
        if (arg1 > -118) {
            field5204 = -51;
        }
        Method var2 = class224.field3584;
        field5215++;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class158.field2464);
        arg0.addFocusListener(class158.field2464);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIII)V", line = 138)
    public static final void method2333(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5217++;
        if (arg3 > -10) {
            field5214 = (int[]) null;
        }
        if (class74.field1109 < 100) {
            class225.method1533((byte) 127);
        }
        if (class333.field5166) {
            class238.method1633(arg1, arg2, arg1 + arg4, arg0 + arg2);
        } else {
            class57.method395(arg1, arg2, arg1 + arg4, arg0 + arg2);
        }
        if (class74.field1109 < 100) {
            byte var5 = 20;
            int var6 = arg4 / 2 + arg1;
            int var7 = arg0 / 2 + arg2 - var5 - 18;
            if (class333.field5166) {
                class238.method1636(arg1, arg2, arg4, arg0, 0);
                class238.method1621(var6 - 152, var7, 304, 34, 9179409);
                class238.method1621(var6 - 151, var7 + 1, 302, 32, 0);
                class238.method1636(var6 - 150, var7 - -2, class74.field1109 * 3, 30, 9179409);
                class238.method1636(var6 + (class74.field1109 * 3) - 150, var7 - -2, 300 - class74.field1109 * 3, 30, 0);
            } else {
                class57.method375(arg1, arg2, arg4, arg0, 0);
                class57.method388(var6 - 152, var7, 304, 34, 9179409);
                class57.method388(var6 - 151, var7 + 1, 302, 32, 0);
                class57.method375(var6 - 150, var7 + 2, class74.field1109 * 3, 30, 9179409);
                class57.method375(class74.field1109 * 3 + var6 - 150, var7 + 2, 300 - (class74.field1109 * 3), 30, 0);
            }
            class286.field4380.method1245(class108.field1670, var6, var5 + var7, 16777215, -1);
            return;
        }
        class47.field664 = (int) ((float) (arg0 * 2) / class276.field4253);
        class45.field634 = class342.field5334 - ((int) ((float) arg0 / class276.field4253));
        class91.field1417 = class129.field2023 - ((int) ((float) arg4 / class276.field4253));
        int var8 = class129.field2023 - ((int) ((float) arg4 / class276.field4253));
        class329.field5083 = (int) ((float) (arg4 * 2) / class276.field4253);
        int var9 = class342.field5334 - ((int) ((float) arg0 / class276.field4253));
        int var10 = (int) ((float) arg0 / class276.field4253) + class342.field5334;
        int var11 = (int) ((float) arg4 / class276.field4253) + class129.field2023;
        if (class333.field5166) {
            if (class61.field853 == null || class61.field853.field3847 != arg4 || class61.field853.field3844 != arg0) {
                class61.field853 = null;
                class61.field853 = new class178(arg4, arg0);
            }
            class57.method377(class61.field853.field2734, arg4, arg0);
            class215.method1440(0, var10, arg4, 0, var11, var8, var9, arg0, (byte) -81);
            class15.method119(var11, class219.field3484, true, var10, 0, var8, arg4, var9, 0, arg0);
            class136.method929(var11, arg0, 0, var10, arg4, var9, 0, true, var8);
            class61.field853.method1221();
            class238.method1623(class61.field853.field2734, arg1, arg2, arg4, arg0);
            class57.field797 = null;
        } else {
            class215.method1440(arg1, var10, arg1 + arg4, arg2, var11, var8, var9, arg0 + arg2, (byte) -86);
            class15.method119(var11, class219.field3484, true, var10, arg1, var8, arg1 + arg4, var9, arg2, arg0 + arg2);
            class136.method929(var11, arg0 + arg2, arg2, var10, arg1 + arg4, var9, arg1, true, var8);
        }
        if (class190.field2894 > 0) {
            class96.field1470--;
            if (class96.field1470 == 0) {
                class96.field1470 = 20;
                class190.field2894--;
            }
        }
        if (!class315.field4964) {
            return;
        }
        int var12 = arg1 + arg4 - 5;
        int var13 = arg0 + arg2 - 8;
        class179.field2736.method1231("Fps:" + class240.field3813, var12, var13, 16776960, -1);
        int var17 = var13 - 15;
        Runtime var14 = Runtime.getRuntime();
        int var15 = 16776960;
        int var16 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
        if (var16 > 65536) {
            var15 = 16711680;
        }
        class179.field2736.method1231("Mem:" + var16 + "k", var12, var17, var15, -1);
        var13 = var17 - 15;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V", line = 259)
    public static final void method2334(int arg0) {
        class177.field2712 = "Fallen lassen";
        class282.field4336 = "Hierhin drehen";
        class155.field2438 = "weiss:";
        class174.field2642 = "blinken3:";
        class170.field2589 = "welle2:";
        class231.field3723 = "Gegenstand für Mitglieder";
        class24.field303 = "Lade Texturen - ";
        class282.field4330 = "Update-Liste geladen.";
        class294.field4542 = "T";
        class228.field3657 = "Versteckt";
        class334.field5201 = "Ablegen";
        class106.field1622 = "Zugewiesener Speicher.";
        class203.field3062 = "Auswählen";
        class332.field5141 = "3D-Softwarebibliothek gestartet.";
        class317.field4982 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class200.field3016 = "Ladevorgang - bitte warte.";
        class280.field4326 = "Untersuchen";
        class275.field4240 = " steht bereits auf deiner Ignorieren-Liste!";
        class285.field4373 = "Titelbild geladen.";
        class259.field4028 = "RuneScape wird geladen - bitte warten...";
        class133.field2101 = "welle:";
        class220.field3498 = "Weiter";
        class89.field1357 = "blaugrün:";
        class79.field1176 = "Abbrechen";
        class26.field340 = "Lade Schriftsätze - ";
        class299.field4641 = ": ";
        class82.field1244 = "Lade Wordpack - ";
        class329.field5088 = "Lade Benutzeroberfläche - ";
        class255.field3991 = "Sprites geladen.";
        class124.field1936 = "grün:";
        class330.field5099 = "Spielwelt erstellt.";
        class23.field297 = "Verbindung abgebrochen.";
        class132.field2090 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class82.field1224 = "Wähl eine Option";
        class152.field2411 = " loggt sich aus.";
        class304.field4751 = "Lade Standardeinstellungen - ";
        class338.field5231 = "Musik-Engine vorbereitet.";
        class69.field1028 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class177.field2693 = " loggt sich ein.";
        class82.field1217 = "Benutzen";
        class332.field5137 = " zuerst von deiner Ignorieren-Liste!";
        class205.field3093 = "Wordpack geladen.";
        class51.field731 = "Liste der Welten geladen";
        class123.field1924 = "Spieler kann nicht gefunden werden: ";
        class266.field4102 = "Starte 3D-Softwarebibliothek.";
        class27.field353 = "Kampfstufe: ";
        class130.field2027 = "Texturen geladen.";
        class161.field2498 = "blinken2:";
        class334.field5190 = "Verbindung mit Update-Server...";
        if (arg0 < 12) {
            return;
        }
        class264.field4066 = "gleiten:";
        class150.field2366 = "Lade Konfiguration - ";
        class108.field1670 = "Lade...";
        class309.field4859 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class51.field730 = "leuchten3:";
        class247.field3885 = "Suche nach Updates - ";
        class187.field2842 = "Bitte entferne ";
        class305.field4768 = "leuchten2:";
        class231.field3726 = "Fertigkeit: ";
        class3.field29 = "Titelbild geöffnet.";
        class125.field1950 = "Schriftsätze geladen.";
        class233.field3749 = "schütteln:";
        class29.field363 = "Lade Sprites - ";
        class15.field157 = " weitere Optionen";
        class40.field573 = "Eingabeprozedur geladen.";
        class107.field1644 = "leuchten1:";
        class106.field1628 = "T";
        class185.field2832 = "Stufe: ";
        class246.field3855 = "Schließen";
        class105.field1613 = "scrollen:";
        class154.field2416 = "Standardinstellungen geladen";
        class164.field2530 = "Bitte warte...";
        class125.field1951 = "Nehmen";
        class35.field450 = " zuerst von deiner Freunde-Liste!";
        class84.field1280 = "Konfig geladen.";
        field5206++;
        class93.field1436 = "M";
        class26.field338 = "Lade Titelbild - ";
        class158.field2465 = "M";
        class293.field4511 = "Angreifen";
        class40.field572 = "gelb:";
        class110.field1701 = "Verbindung zum Update-Server hergestellt.";
        class23.field287 = "lila:";
        class306.field4801 = "Hierhin gehen";
        class190.field2899 = "rot:";
        class77.field1149 = "Okay";
        class136.field2110 = "blinken1:";
        class307.field4835 = "Bitte entferne ";
        class190.field2892 = " steht bereits auf deiner Freunde-Liste!";
        class262.field4055 = "Lade Liste der Welten";
        class143.field2265 = "Speicher wird zugewiesen.";
        class229.field3688 = "möchte mit dir handeln.";
        class330.field5114 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class169.field2580 = "Benutzeroberfläche geladen.";
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)V", line = 591)
    public final void method2335(int arg0) {
        field5207++;
        if (this.field5212 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field5212.length; var2++) {
            if (this.field5212[var2] != null) {
                this.field5212[var2].method1712(true);
            }
        }
        if (arg0 < 95) {
            field5208 = 74;
        }
        for (int var3 = 0; var3 < this.field5212.length; var3++) {
            if (this.field5212[var3] != null) {
                this.field5212[var3].method1709(93);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lnh;Lff;)V", line = 628)
    public class335(class247 arg0, class214 arg1) {
        this.field5213 = arg0;
        this.field5209 = arg1;
        if (!this.field5213.method1682(123)) {
            this.field5216 = this.field5213.method1669(true, 255, (byte) 85, 255, (byte) 0);
        }
    }
}
