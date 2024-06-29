import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class314 {

    @OriginalMember(owner = "client!td", name = "b", descriptor = "Lcu;")
    public static class145 field4112 = new class145(26, 7);

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field4116 = 0;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Lvj;")
    public static class304 field4114 = new class304("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!td", name = "h", descriptor = "Ljp;")
    public static class236 field4118 = new class236(64);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "[Lf;")
    public static class529[] field4115;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
    public static final void method1817(byte arg0) {
        field4117++;
        if (class294.field3847.length() == 0) {
            return;
        }
        class176.method1181("--> " + class294.field3847, false);
        class497.method2850(class294.field3847, 29685, false);
        if (arg0 != -102) {
            field4116 = 94;
        }
        class413.field5715 = 0;
        class77.field1154 = 0;
        class294.field3847 = "";
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)V")
    public static final void method1818(byte arg0, int arg1) {
        if (arg0 != -116) {
            method1818((byte) -40, 94);
        }
        for (class42 var2 = class127.field1849.method181((byte) -70); var2 != null; var2 = class127.field1849.method179(arg0 ^ 0xFFFFFF8D)) {
            if ((long) arg1 == (var2.field622 >> 48 & 0xFFFFL)) {
                var2.method300(false);
            }
        }
        field4111++;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
    public static void method1819(byte arg0) {
        field4118 = null;
        field4114 = null;
        field4112 = null;
        field4115 = null;
        if (arg0 != 115) {
            field4118 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLjava/awt/Component;)Lln;")
    public static final class256 method1820(byte arg0, Component arg1) {
        field4113++;
        if (arg0 != 66) {
            method1820((byte) 43, null);
        }
        return new class44(arg1);
    }
}
