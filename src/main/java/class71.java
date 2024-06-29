import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class71 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "Lqf;")
    public static class165 field1376 = null;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "Lrd;")
    private static class173 field1375 = class133.method843("Welcome to RuneScape", -81);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "Lrd;")
    public static class173 field1379 = field1375;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "Lb;")
    public static class11 field1378 = new class11(0, 0);

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "Lrd;")
    public static class173 field1383 = class133.method843("leuchten1:", 82);

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "Lrd;")
    public static class173 field1388 = class133.method843("<img=1>", -109);

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "[I")
    public static int[] field1385 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "Lcg;")
    public static class28 field1389 = new class28();

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "Lrd;")
    public static class173 field1390 = class133.method843("sl_stars", -89);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "Lsa;")
    public static class180 field1386;

    @OriginalMember(owner = "client!ha", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class15.field343 != null) {
            class37.field794 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class121.field2256.length) {
                var3 = class121.field2256[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class212.field4103 >= 0 && var3 >= 0) {
                class112.field2081[class212.field4103] = var3;
                class212.field4103 = class212.field4103 + 1 & 0x7F;
                if (class212.field4103 == class104.field1932) {
                    class212.field4103 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class176.field3453 + 1 & 0x7F;
                if (class202.field3896 != var4) {
                    class223.field4269[class176.field3453] = var3;
                    class66.field1293[class176.field3453] = -1;
                    class176.field3453 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field1374++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lad;)V")
    public static final void method431(class5 arg0) {
        for (int var1 = arg0.field120; var1 <= arg0.field112; var1++) {
            for (int var2 = arg0.field125; var2 <= arg0.field104; var2++) {
                class105 var3 = class208.field4055[arg0.field115][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1972; var4++) {
                        if (var3.field1948[var4] == arg0) {
                            var3.field1972--;
                            for (int var5 = var4; var5 < var3.field1972; var5++) {
                                var3.field1948[var5] = var3.field1948[var5 + 1];
                                var3.field1950[var5] = var3.field1950[var5 + 1];
                            }
                            var3.field1948[var3.field1972] = null;
                            break;
                        }
                    }
                    var3.field1943 = 0;
                    for (int var6 = 0; var6 < var3.field1972; var6++) {
                        var3.field1943 |= var3.field1950[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static void method432(int arg0) {
        field1388 = null;
        field1378 = null;
        field1390 = null;
        field1383 = null;
        field1389 = null;
        field1376 = null;
        field1385 = null;
        field1386 = null;
        field1375 = null;
        if (arg0 == -28078) {
            field1379 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field1381++;
        if (class15.field343 != null) {
            int var2 = class120.method729(arg0, -51);
            if (var2 >= 0) {
                int var3 = class176.field3453 + 1 & 0x7F;
                if (class202.field3896 != var3) {
                    class223.field4269[class176.field3453] = -1;
                    class66.field1293[class176.field3453] = var2;
                    class176.field3453 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ha", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field1380++;
        if (class15.field343 != null) {
            class37.field794 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class121.field2256.length) {
                var3 = class121.field2256[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class212.field4103 >= 0 && var3 >= 0) {
                class112.field2081[class212.field4103] = ~var3;
                class212.field4103 = class212.field4103 + 1 & 0x7F;
                if (class212.field4103 == class104.field1932) {
                    class212.field4103 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ha", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class15.field343 != null) {
            class212.field4103 = -1;
        }
        field1382++;
    }

    @OriginalMember(owner = "client!ha", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1377++;
    }
}
