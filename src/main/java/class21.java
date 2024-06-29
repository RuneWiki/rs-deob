import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class21 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Lsg;")
    public static class169 field452 = class165.method1060("Mitglieder)2Welt", 1536);

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "Lsg;")
    public static class169 field455 = null;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "Lsg;")
    private static class169 field445 = class165.method1060("You have only just left another world)3", 1536);

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Lsg;")
    public static class169 field446 = field445;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Lke;")
    public static class95 field447;

    @OriginalMember(owner = "client!ca", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field449++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLlf;)V")
    public static final void method141(byte arg0, class105 arg1) {
        if (arg0 >= -72) {
            field444 = 74;
        }
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (arg1.field1931 == 0) {
            var4 = class196.field3840.method896(arg1.field1940, arg1.field1921, arg1.field1932);
        }
        field443++;
        if (arg1.field1931 == 1) {
            var4 = class196.field3840.method901(arg1.field1940, arg1.field1921, arg1.field1932);
        }
        if (arg1.field1931 == 2) {
            var4 = class196.field3840.method882(arg1.field1940, arg1.field1921, arg1.field1932);
        }
        if (arg1.field1931 == 3) {
            var4 = class196.field3840.method891(arg1.field1940, arg1.field1921, arg1.field1932);
        }
        if (var4 != 0) {
            int var6 = class196.field3840.method878(arg1.field1940, arg1.field1921, arg1.field1932, var4);
            var3 = var6 >> 6 & 0x3;
            var5 = var6 & 0x1F;
            var2 = var4 >> 14 & 0x7FFF;
        }
        arg1.field1923 = var5;
        arg1.field1937 = var2;
        arg1.field1939 = var3;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method142(int arg0, String arg1, Throwable arg2) {
        field448++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class95.method563(arg2, 51);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class150.field2828.field1986 != null) {
                class170 var8 = class150.field2828.method672((byte) -99, new URL(class150.field2828.field1986.getCodeBase(), "clienterror.ws?c=" + class82.field1511 + "&u=" + class44.field829 + "&v1=" + class109.field1993 + "&v2=" + class109.field1984 + "&e=" + var7));
                int var9 = -46 % ((arg0 + 11) / 63);
                while (var8.field3296 == 0) {
                    client.method203(1L, (byte) -115);
                }
                if (var8.field3296 == 1) {
                    DataInputStream var10 = (DataInputStream) var8.field3299;
                    var10.read();
                    var10.close();
                }
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!ca", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class142.field2654 != null) {
            class80.field1470 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class37.field736.length) {
                var3 = class37.field736[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class69.field1294 >= 0 && var3 >= 0) {
                class54.field997[class69.field1294] = var3;
                class69.field1294 = class69.field1294 + 1 & 0x7F;
                if (class69.field1294 == class31.field661) {
                    class69.field1294 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class126.field2302 + 1 & 0x7F;
                if (class107.field1950 != var4) {
                    class64.field1184[class126.field2302] = var3;
                    class70.field1312[class126.field2302] = -1;
                    class126.field2302 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field451++;
    }

    @OriginalMember(owner = "client!ca", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class142.field2654 != null) {
            int var2 = class142.method944((byte) -69, arg0);
            if (var2 >= 0) {
                int var3 = class126.field2302 + 1 & 0x7F;
                if (class107.field1950 != var3) {
                    class64.field1184[class126.field2302] = -1;
                    class70.field1312[class126.field2302] = var2;
                    class126.field2302 = var3;
                }
            }
        }
        field453++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
    public static final void method143(byte arg0) {
        field450++;
        class199.field3895 = 0;
        class82.field1510 = 0;
        if (arg0 >= -49) {
            field455 = null;
        }
        class175.method1176(100);
        class199.method1303(8477);
        class201.method1314((byte) 108);
        class202.method1317((byte) 93);
        for (int var1 = 0; var1 < class82.field1510; var1++) {
            int var3 = class35.field699[var1];
            if (class162.field3107 != class65.field1213[var3].field3700) {
                class65.field1213[var3] = null;
            }
        }
        if (class27.field553 != class85.field1559.field2346) {
            throw new RuntimeException("gpp1 pos:" + class85.field1559.field2346 + " psize:" + class27.field553);
        }
        for (int var2 = 0; var2 < class141.field2631; var2++) {
            if (class65.field1213[class202.field3932[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class141.field2631);
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class142.field2654 != null) {
            class69.field1294 = -1;
        }
        field457++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method144(int arg0) {
        field452 = null;
        field446 = null;
        if (arg0 == 10) {
            field445 = null;
            field455 = null;
            field447 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field456++;
        if (class142.field2654 != null) {
            class80.field1470 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class37.field736.length) {
                var3 = class37.field736[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class69.field1294 >= 0 && var3 >= 0) {
                class54.field997[class69.field1294] = ~var3;
                class69.field1294 = class69.field1294 + 1 & 0x7F;
                if (class69.field1294 == class31.field661) {
                    class69.field1294 = -1;
                }
            }
        }
        arg0.consume();
    }
}
