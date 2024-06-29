import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class110 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Lec;")
    public static class28 field2312 = class28.method210(-46, "To create a new account you need to");

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field2314 = 0;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "[I")
    public static int[] field2321 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!t", name = "m", descriptor = "Lec;")
    public static class28 field2323 = class28.method210(-46, "red:");

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public static int field2320 = 7759444;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public static int field2325 = -1;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "Lcc;")
    public static class16 field2324;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public static void method751(int arg0) {
        field2324 = null;
        field2312 = null;
        field2323 = null;
        if (arg0 != 3270) {
            field2320 = -105;
        }
        field2321 = null;
    }

    @OriginalMember(owner = "client!t", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2327++;
    }

    @OriginalMember(owner = "client!t", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field2322++;
        if (class49.field1133 != null) {
            client.field394 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class90.field1972.length) {
                var3 = class90.field1972[var2];
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
                var4 = class7.method38((byte) -112, arg0);
            }
            if (class118.field2504 >= 0 && var3 >= 0) {
                class76.field1690[class118.field2504] = var3;
                class118.field2504 = class118.field2504 + 1 & 0x7F;
                if (class118.field2504 == class106.field2253) {
                    class118.field2504 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class43.field914 + 1 & 0x7F;
                if (class94.field2078 != var5) {
                    class74.field1648[class43.field914] = var3;
                    class64.field1426[class43.field914] = var4;
                    class43.field914 = var5;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IZ)Z")
    public static final boolean method752(int arg0, boolean arg1) {
        if (arg1) {
            field2321 = null;
        }
        field2316++;
        if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BI)Lee;")
    public static final class30 method753(byte arg0, int arg1) {
        field2313++;
        class30 var2 = (class30) class18.field361.method660(-2, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 == 121) {
            byte[] var3 = class47.field1081.method932(-95, arg1, 16);
            class30 var4 = new class30();
            if (var3 != null) {
                var4.method246(new class119(var3), (byte) -79);
            }
            class18.field361.method666(false, var4, (long) arg1);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
    public static final void method754(byte arg0) {
        class5 var1 = class16.field302;
        synchronized (class16.field302) {
            class36.field790 = class34.field779;
            class23.field530 = class103.field2202;
            class88.field1960 = class112.field2423;
            class40.field868 = class4.field67;
            class96.field2143 = class13.field230;
            class32.field680 = class15.field285;
            class43.field947 = class64.field1425;
            class4.field67 = 0;
            int var2 = 65 / ((arg0 - 37) / 54);
        }
        field2317++;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
    public static final void method755(boolean arg0) {
        class78.field1809.method659(1000);
        if (arg0) {
            field2325 = 38;
        }
        class42.field888.method659(1000);
        field2328++;
    }

    @OriginalMember(owner = "client!t", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field2319++;
        if (class49.field1133 != null) {
            client.field394 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class90.field1972.length > var2) {
                var3 = class90.field1972[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class118.field2504 >= 0 && var3 >= 0) {
                class76.field1690[class118.field2504] = ~var3;
                class118.field2504 = class118.field2504 + 1 & 0x7F;
                if (class118.field2504 == class106.field2253) {
                    class118.field2504 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!t", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field2318++;
        if (class49.field1133 != null) {
            class118.field2504 = -1;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZLjava/awt/Graphics;)V")
    public static final void method756(boolean arg0, Graphics arg1) {
        class5.field94.method91(0, arg1, 11675, 4);
        class95.field2108.method91(0, arg1, 11675, 357);
        class40.field866.method91(722, arg1, 11675, 4);
        field2311++;
        class47.field1069.method91(743, arg1, 11675, 205);
        class31.field664.method91(0, arg1, 11675, 0);
        class69.field1543.method91(516, arg1, 11675, 4);
        if (!arg0) {
            method753((byte) -53, 84);
        }
        class42.field910.method91(516, arg1, 11675, 205);
        class32.field684.method91(496, arg1, 11675, 357);
        class28.field636.method91(0, arg1, 11675, 338);
    }

    @OriginalMember(owner = "client!t", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        arg0.consume();
        field2326++;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(Z)V")
    public static final void method757(boolean arg0) {
        field2315++;
        class3.field31.method92((byte) -4);
        class27.field572.method977(0, 0);
        class53.field1213 = class60.method491(class53.field1213);
        if (arg0) {
            field2325 = -29;
        }
    }
}
