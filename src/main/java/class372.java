import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class372 extends class392 implements ImageProducer {

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!eb", name = "C", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "Lbd;")
    public static class38 field5439;

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5436;

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "Ljava/awt/Image;")
    private Image field5432;

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field5438;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field5430;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V", line = 9)
    public final void method1959(Graphics arg0, int arg1, byte arg2, int arg3) {
        if (arg2 < -41) {
            ++field5426;
            this.method2333(0);
            arg0.drawImage(this.field5432, arg3, arg1, this.field5436);
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(IB)V", line = 21)
    public static final void method2332(int arg0, byte arg1) {
        class178.field2461 = arg0;
        if (arg1 <= -83) {
            ++field5422;
            class396.field5782.method2043(-34);
        }
    }

    @OriginalMember(owner = "client!eb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 33)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field5440;
        return this.field5430 == arg0;
    }

    @OriginalMember(owner = "client!eb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 41)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field5424;
        this.field5430 = arg0;
        arg0.setDimensions(super.field5732, super.field5728);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field5438);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!eb", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 56)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field5433;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V", line = 66)
    private final synchronized void method2333(int arg0) {
        ++field5427;
        if (this.field5430 != null) {
            this.field5430.setPixels(arg0, 0, super.field5732, super.field5728, this.field5438, super.field5731, 0, super.field5732);
            this.field5430.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!eb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 79)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field5430 == arg0) {
            this.field5430 = null;
        }
        ++field5423;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V", line = 92)
    public static void method2334(int arg0) {
        if (arg0 == -1) {
            field5439 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIBI)I", line = 102)
    public static final int method2335(int arg0, int arg1, byte arg2, int arg3) {
        ++field5428;
        if (arg2 < 20) {
            method2332(-102, (byte) -68);
        }
        if (class132.field1814 == null) {
            return 0;
        } else {
            int var4 = arg3 >> 7;
            int var5 = arg0 >> 7;
            if (var4 >= 0 && var5 >= 0 && var4 <= class279.field3935 + -1 && class164.field2287 + -1 >= var5) {
                int var6 = arg1;
                if (arg1 < 3 && ~(class166.field2327[1][var4][var5] & 2) != -1) {
                    var6 = arg1 + 1;
                }
                return class132.field1814[var6].method1991(arg3, arg0);
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZIII)V", line = 128)
    private final synchronized void method2336(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg1) {
            this.method2336(7, false, -105, -62, 52);
        }
        ++field5435;
        if (this.field5430 != null) {
            this.field5430.setPixels(arg3, arg4, arg0, arg2, this.field5438, super.field5731, super.field5732 * arg4 + arg3, super.field5732);
            this.field5430.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V", line = 149)
    public static final void method2337(int arg0) {
        class359.field5245 = "Titelbild geöffnet.";
        class144.field2033 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class402.field5868 = "Verbindung abgebrochen.";
        class375.field5470 = "lila:";
        class422.field6059 = " zuerst von deiner Ignorieren-Liste!";
        class388.field5684 = "rot:";
        class10.field114 = "Bitte entferne ";
        class213.field2916 = "Schließen";
        class39.field411 = "Lade Standardeinstellungen - ";
        class452.field6583 = "Abbrechen";
        class180.field2473 = "Mechscape wird geladen - bitte warten...";
        class437.field6409 = "Verbindung zum Update-Server hergestellt.";
        class54.field614 = "Update-Liste geladen.";
        class115.field1333 = "Verbindung mit Update-Server...";
        class437.field6408 = "Hierhin drehen";
        class224.field3060 = "Zugewiesener Speicher.";
        class113.field1302 = "Benutzeroberfläche geladen.";
        class35.field340 = "Bitte warte...";
        class150.field2098 = "blinken1:";
        class50.field571 = "M";
        class426.field6177 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class20.field208 = "Client-Variablen geladen";
        class233.field3144 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class348.field5084 = "Titelbild geladen.";
        class306.field4389 = "T";
        class12.field132 = " weitere Optionen";
        class418.field6014 = " loggt sich aus.";
        class193.field2641 = "Lade Texturen - ";
        class448.field6541 = "Bitte entferne ";
        class189.field2569 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class335.field4956 = " zuerst von deiner Freunde-Liste!";
        class155.field2217 = "Lade Konfiguration - ";
        if (arg0 < 124) {
            method2339(-7, 73);
        }
        class427.field6209 = "leuchten3:";
        class10.field121 = "Lade Titelbild - ";
        class166.field2343 = "Fertigkeit: ";
        class63.field725 = "blaugrün:";
        class323.field4556 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class73.field821 = " steht bereits auf deiner Freunde-Liste!";
        class420.field6043 = "Eingabeprozedur geladen.";
        class34.field331 = "Spielwelt erstellt.";
        class369.field5416 = "Konfig geladen.";
        class251.field3397 = "Hierhin gehen";
        class291.field4175 = "Untersuchen";
        class8.field103 = " loggt sich ein.";
        class191.field2598 = "T";
        class216.field2955 = "Standardeinstellungen geladen";
        class271.field3841 = "blinken2:";
        class88.field984 = "3D-Softwarebibliothek gestartet.";
        class179.field2467 = "Benutzen";
        class122.field1623 = "Spieler kann nicht gefunden werden: ";
        class221.field3026 = "Lade Sprites - ";
        class179.field2470 = "Sprites geladen.";
        class427.field6213 = "weiss:";
        class311.field4444 = "Texturen geladen.";
        class291.field4201 = "leuchten1:";
        class358.field5232 = "Liste der Welten geladen";
        class50.field583 = "Speicher wird zugewiesen.";
        class222.field3040 = "Lade Wordpack - ";
        class326.field4582 = "Wähl eine Option";
        class281.field3948 = "Auswählen";
        class171.field2399 = "Gegenstand für Mitglieder";
        class433.field6328 = "Stufe: ";
        class289.field4090 = "gelb:";
        class98.field1101 = "M";
        class12.field133 = "welle2:";
        class195.field2649 = "scrollen:";
        class407.field5907 = "Ladevorgang - bitte warte.";
        class188.field2552 = "Okay";
        class417.field5995 = "Fallen lassen";
        class442.field6459 = "Starte 3D-Softwarebibliothek.";
        class435.field6379 = "blinken3:";
        class376.field5498 = "Lade Benutzeroberfläche - ";
        class160.field2270 = "welle:";
        class245.field3321 = "grün:";
        ++field5429;
        class221.field3032 = "Schriftsätze geladen.";
        class85.field964 = "leuchten2:";
        class200.field2743 = "Musik-Engine vorbereitet.";
        class77.field863 = "Lade Schriftsätze - ";
        class7.field95 = "Versteckt";
        class21.field225 = ": ";
        class349.field5099 = "Ablegen";
        class102.field1162 = "gleiten:";
        class350.field5108 = "Nehmen";
        class16.field166 = "Weiter";
        class52.field596 = "Angreifen";
        class364.field5298 = "schütteln:";
        class244.field3294 = "Lade Liste der Welten";
        class206.field2807 = "Kampfstufe: ";
        class436.field6387 = " steht bereits auf deiner Ignorieren-Liste!";
        class189.field2576 = "Lade...";
        class72.field810 = "Wordpack geladen.";
        class171.field2394 = "RuneScape wird geladen - bitte warten...";
        class101.field1135 = "Suche nach Updates - ";
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V", line = 424)
    public static final void method2338(int arg0) {
        class278.field3922 = null;
        if (arg0 > 42) {
            class237.field3228 = null;
            ++field5425;
            class438.field6421 = false;
            class447.field6515 = null;
            class48.field560 = null;
            class356.field5206 = null;
            class109.method609(65);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V", line = 441)
    public final void method1958(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        this.method2336(arg2, false, arg1, arg0, arg4);
        ++field5431;
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg0, arg4, arg2, arg1);
        arg3.drawImage(this.field5432, 0, 0, this.field5436);
        arg3.setClip(var7);
        if (arg5 != 128) {
            this.field5432 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/awt/Canvas;B)V", line = 459)
    public final void method1960(Canvas arg0, byte arg1) {
        this.field5436 = arg0;
        ++field5441;
        int var3 = 109 / ((arg1 - 3) / 57);
        super.field5732 = this.field5436.getSize().width;
        super.field5728 = this.field5436.getSize().height;
        super.field5731 = new int[super.field5732 * super.field5728];
        this.field5438 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field5432 = this.field5436.createImage(this);
        this.method2333(0);
        this.field5436.prepareImage(this.field5432, this.field5436);
        this.method2333(0);
        this.field5436.prepareImage(this.field5432, this.field5436);
        this.method2333(0);
        this.field5436.prepareImage(this.field5432, this.field5436);
    }

    @OriginalMember(owner = "client!eb", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 480)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field5437;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(II)Lf;", line = 488)
    public static final class450 method2339(int arg0, int arg1) {
        ++field5434;
        if (arg0 != -1) {
            method2332(72, (byte) -105);
        }
        class450 var2 = (class450) class132.field1808.method410((byte) -115, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class35.field341.method361(class413.method2591(-6129, arg1), 93, class228.method1470(arg1, false));
            class450 var4 = new class450();
            if (var3 != null) {
                var4.method2799(30391, new class211(var3));
            }
            class132.field1808.method414(var4, (byte) 66, (long) arg1);
            return var4;
        }
    }
}
