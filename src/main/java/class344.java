import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class344 {

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Lak;")
    public static class234 field5092 = new class234("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "J")
    public static long field5093;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static void method2148(byte arg0) {
        int var1 = 111 / ((-arg0 - 12) / 41);
        field5092 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
    public static final void method2149(int arg0, int arg1, int arg2) {
        field5094++;
        if (arg0 != 0) {
            method2149(31, 105, 15);
        }
        if (class402.field5977 != arg1) {
            class109.field1530 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class109.field1530[var3] = (var3 << 12) / arg1;
            }
            class402.field5977 = arg1;
            class446.field6541 = arg1 - 1;
            class24.field292 = arg1 * 32;
        }
        if (class329.field4952 == arg2) {
            return;
        }
        if (class402.field5977 == arg2) {
            class505.field7381 = class109.field1530;
        } else {
            class505.field7381 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class505.field7381[var4] = (var4 << 12) / arg2;
            }
        }
        class329.field4952 = arg2;
        class123.field1843 = arg2 - 1;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static final void method2150(int arg0) {
        field5095++;
        if (class197.field3291 == 0) {
            return;
        }
        try {
            if (++class490.field7043 > 2000) {
                if (class162.field2413 != null) {
                    class162.field2413.method1966(97);
                    class162.field2413 = null;
                }
                if (class517.field7517 >= 1) {
                    class197.field3291 = 0;
                    class182.field2723 = -5;
                    return;
                }
                class197.field3291 = 1;
                class490.field7043 = 0;
                class517.field7517++;
                class12.field163.field6308 = !class12.field163.field6308;
            }
            if (class197.field3291 == 1) {
                class363.field5377 = class360.field5349.method2197(class12.field163.method2649(0), class12.field163.field6311, 0);
                class197.field3291 = 2;
            }
            if (class197.field3291 == 2) {
                if (class363.field5377.field6570 == 2) {
                    throw new IOException();
                }
                if (class363.field5377.field6570 != 1) {
                    return;
                }
                class162.field2413 = new class307((Socket) class363.field5377.field6569, class360.field5349);
                class363.field5377 = null;
                class162.field2413.method1969(class71.field1020.field3572, 0, (byte) 29, class71.field1020.field3556);
                class486.method2906((byte) 123);
                int var1 = class162.field2413.method1968((byte) 84);
                class486.method2906((byte) 123);
                if (var1 != 21) {
                    class197.field3291 = 0;
                    class182.field2723 = var1;
                    class162.field2413.method1966(126);
                    class162.field2413 = null;
                    return;
                }
                class197.field3291 = 3;
            }
            if (class197.field3291 == 3) {
                if (class162.field2413.method1970(true) < 1) {
                    return;
                }
                class339.field5051 = new String[class162.field2413.method1968((byte) 58)];
                class197.field3291 = 4;
            }
            if (class197.field3291 == 4) {
                if (class162.field2413.method1970(true) >= class339.field5051.length * 8) {
                    class238.field3819.field3556 = 0;
                    class162.field2413.method1965(0, class339.field5051.length * 8, (byte) -81, class238.field3819.field3572);
                    for (int var2 = 0; var2 < class339.field5051.length; var2++) {
                        class339.field5051[var2] = class149.method1040(class238.field3819.method1520((byte) 14), 37);
                    }
                    class197.field3291 = 0;
                    class182.field2723 = 21;
                    class162.field2413.method1966(106);
                    class162.field2413 = null;
                }
            } else if (arg0 <= 71) {
                field5093 = 96L;
            }
        } catch (IOException var3) {
            if (class162.field2413 != null) {
                class162.field2413.method1966(105);
                class162.field2413 = null;
            }
            if (class517.field7517 < 1) {
                class490.field7043 = 0;
                class197.field3291 = 1;
                class517.field7517++;
                class12.field163.field6308 = !class12.field163.field6308;
            } else {
                class182.field2723 = -4;
                class197.field3291 = 0;
            }
        }
    }
}
