import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class51 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Lwb;")
    private static class130 field1337 = class26.method212("cyan:", -32376);

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "Lwb;")
    public static class130 field1339 = class26.method212("mod_icons", -32376);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Lwb;")
    public static class130 field1331 = class26.method212("Bitte versuchen Sie es erneut)3", -32376);

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field1340 = 0;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "Lwb;")
    public static class130 field1341 = field1337;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Lge;")
    public static class41 field1332 = new class41(20);

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "Ls;")
    public static class108 field1343 = new class108();

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "Lwb;")
    private static class130 field1347 = class26.method212("The server is being updated)3", -32376);

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "Z")
    public static boolean field1345 = false;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "[I")
    public static int[] field1349 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "Lwb;")
    public static class130 field1351 = class26.method212("mapedge", -32376);

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "Lwb;")
    public static class130 field1350 = field1347;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "[Lr;")
    public static class102[] field1353 = new class102[4];

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "Lda;")
    public static class20 field1354;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "Lk;")
    public static class60 field1346;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "[Lec;")
    public static class28[] field1348;

    @OriginalMember(owner = "client!ic", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 26)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field1342++;
        if (class56.field1426 != null) {
            class60.field1557 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class71.field1817.length > var2) {
                var3 = class71.field1817[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            int var4;
            if (var3 == 85 || var3 == 80 || var3 == 84 || var3 == 0 || var3 == 101) {
                var4 = -1;
            } else {
                var4 = class22.method199(arg0, -71);
            }
            if (class21.field622 >= 0 && var3 >= 0) {
                class116.field2851[class21.field622] = var3;
                class21.field622 = class21.field622 + 1 & 0x7F;
                if (class21.field622 == class115.field2827) {
                    class21.field622 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class103.field2531 + 1 & 0x7F;
                if (class96.field2332 != var5) {
                    class90.field2189[class103.field2531] = var3;
                    class6.field213[class103.field2531] = var4;
                    class103.field2531 = var5;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V", line = 83)
    public static void method445(int arg0) {
        field1353 = null;
        field1348 = null;
        field1349 = null;
        field1341 = null;
        field1339 = null;
        field1346 = null;
        field1354 = null;
        field1331 = null;
        field1351 = null;
        field1337 = null;
        field1350 = null;
        field1347 = null;
        field1332 = null;
        field1343 = null;
        if (arg0 >= -98) {
            method445(87);
        }
    }

    @OriginalMember(owner = "client!ic", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 130)
    public final void focusGained(FocusEvent arg0) {
        field1334++;
    }

    @OriginalMember(owner = "client!ic", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 143)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field1335++;
        if (class56.field1426 != null) {
            class60.field1557 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class71.field1817.length > var2) {
                var3 = class71.field1817[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class21.field622 >= 0 && var3 >= 0) {
                class116.field2851[class21.field622] = ~var3;
                class21.field622 = class21.field622 + 1 & 0x7F;
                if (class21.field622 == class115.field2827) {
                    class21.field622 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ic", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 204)
    public final synchronized void focusLost(FocusEvent arg0) {
        field1336++;
        if (class56.field1426 != null) {
            class21.field622 = -1;
        }
    }

    @OriginalMember(owner = "client!ic", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 238)
    public final void keyTyped(KeyEvent arg0) {
        field1333++;
        arg0.consume();
    }
}
