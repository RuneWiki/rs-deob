import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class98 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field2481 = 0;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static volatile int field2489 = 0;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field2484 = 0;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "Lhb;")
    public static class44 field2494 = class102.method810("Lade Wordpack )2 ", -28606);

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field2496 = -1;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "Lhb;")
    public static class44 field2490 = class102.method810("Der Anmelde)2Server ist offline)3", -28606);

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "[I")
    public static int[] field2500 = new int[256];

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "Lhb;")
    private static class44 field2507 = class102.method810("You need a members account to login to this world)3", -28606);

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field2493 = 0;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "Lhb;")
    private static class44 field2510 = class102.method810("Starting game engine)3)3)3", -28606);

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "Lhb;")
    public static class44 field2495 = field2510;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "Lhb;")
    public static class44 field2487 = field2507;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "Lhb;")
    private static class44 field2504 = class102.method810(" million", -28606);

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "Lhb;")
    public static class44 field2483 = field2504;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "Ltd;")
    private static class116 field2485;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "Lwd;")
    public static class131 field2505;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "Ldb;")
    public static class21 field2509;

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "Lpc;")
    public static class93 field2508;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Z")
    public static boolean field2482;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "[I")
    public static int[] field2503;

    @OriginalMember(owner = "client!qb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 3)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field2491++;
        if (class18.field358 != null) {
            class107.field2720 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class69.field1710.length > var2) {
                var3 = class69.field1710[var2];
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
                var4 = class48.method454(arg0, 85);
            }
            if (class96.field2440 >= 0 && var3 >= 0) {
                class13.field261[class96.field2440] = var3;
                class96.field2440 = class96.field2440 + 1 & 0x7F;
                if (class96.field2440 == class111.field2762) {
                    class96.field2440 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class35.field855 + 1 & 0x7F;
                if (class75.field1899 != var5) {
                    class18.field360[class35.field855] = var3;
                    class81.field2074[class35.field855] = var4;
                    class35.field855 = var5;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)Lrc;", line = 71)
    public static final class105 method773(int arg0, int arg1) {
        field2488++;
        class105 var2 = (class105) client.field368.method330((long) arg1, -1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = field2485.method892(13, arg1, false);
        class105 var4 = new class105();
        if (arg0 >= -96) {
            method777(null, null, 78, 68);
        }
        var4.field2675 = arg1;
        if (var3 != null) {
            var4.method823(new class131(var3), 17);
        }
        client.field368.method332(var4, 0, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V", line = 117)
    public static final void method774(boolean arg0) {
        field2486++;
        class66.method582(2907, class64.field1632);
        if (class109.field2735 != -1) {
            class66.method582(2907, class109.field2735);
        }
        class44.field1124 = 0;
        class1.field20.method747(17);
        class127.field3048 = class58.method548(class127.field3048);
        class112.method854();
        class31.method307(0, 0, -7291, -1, 765, 503, 0, 0, class64.field1632);
        if (class109.field2735 != -1) {
            class31.method307(0, 0, -7291, -1, 765, 503, 0, 0, class109.field2735);
        }
        if (class15.field289) {
            class55.method504(-21975);
        } else {
            class44.method404(10);
            class13.method88(false);
        }
        if (arg0) {
            field2508 = null;
        }
        try {
            Graphics var1 = class22.field483.getGraphics();
            class1.field20.method143(0, var1, -10166, 0);
        } catch (Exception var2) {
            class22.field483.repaint();
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ltd;BLtd;)V", line = 167)
    public static final void method775(class116 arg0, byte arg1, class116 arg2) {
        class44.field1050 = arg0;
        field2485 = arg2;
        field2497++;
        if (arg1 <= 98) {
            method778((byte) 125);
        }
    }

    @OriginalMember(owner = "client!qb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 186)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class18.field358 != null) {
            class107.field2720 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class69.field1710.length > var2) {
                var3 = class69.field1710[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class96.field2440 >= 0 && var3 >= 0) {
                class13.field261[class96.field2440] = ~var3;
                class96.field2440 = class96.field2440 + 1 & 0x7F;
                if (class96.field2440 == class111.field2762) {
                    class96.field2440 = -1;
                }
            }
        }
        field2511++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 232)
    public static void method776(int arg0) {
        field2509 = null;
        field2507 = null;
        field2487 = null;
        field2494 = null;
        field2483 = null;
        field2500 = null;
        field2508 = null;
        if (arg0 != 18587) {
            method777(null, null, 69, 61);
        }
        field2505 = null;
        field2510 = null;
        field2503 = null;
        field2504 = null;
        field2490 = null;
        field2485 = null;
        field2495 = null;
    }

    @OriginalMember(owner = "client!qb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 308)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class18.field358 != null) {
            class96.field2440 = -1;
        }
        field2492++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lr;Lqd;II)V", line = 325)
    public static final void method777(class102 arg0, class100 arg1, int arg2, int arg3) {
        field2499++;
        byte[] var4 = null;
        class47 var5 = class128.field3082;
        synchronized (class128.field3082) {
            for (class107 var6 = (class107) class128.field3082.method443((byte) -111); var6 != null; var6 = (class107) class128.field3082.method434(true)) {
                if ((long) arg3 == var6.field3057 && var6.field2710 == arg0 && var6.field2729 == 0) {
                    var4 = var6.field2706;
                    break;
                }
            }
        }
        if (var4 != null) {
            arg1.method784(255, true, var4, arg0, arg3);
            return;
        }
        if (arg2 > -98) {
            method777(null, null, 22, 15);
        }
        byte[] var7 = arg0.method809(91, arg3);
        arg1.method784(255, true, var7, arg0, arg3);
    }

    @OriginalMember(owner = "client!qb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 375)
    public final void focusGained(FocusEvent arg0) {
        field2498++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 382)
    public static final void method778(byte arg0) {
        field2502++;
        if (class103.field2635 == null) {
            return;
        }
        if (class44.field1122 < 0) {
            if (class18.field352 > 0) {
                class18.field352--;
                if (class18.field352 == 0) {
                    if (class25.field582 == null) {
                        class103.field2635.method49(false, 256);
                    } else {
                        class103.field2635.method49(false, class97.field2460);
                        class44.field1122 = class97.field2460;
                        class103.field2635.method46(client.field377, (byte) -72, class97.field2460, class25.field582);
                        class25.field582 = null;
                    }
                    class92.field2317 = 0;
                }
            }
        } else if (class18.field352 > 0) {
            class92.field2317 += field2484;
            class103.field2635.method45(class92.field2317, (byte) -121, class44.field1122);
            class18.field352--;
            if (class18.field352 == 0) {
                class103.field2635.method47(114);
                class44.field1122 = -1;
                class18.field352 = 20;
            }
        }
        class103.field2635.method51(112);
        if (arg0 > -38) {
            method778((byte) -108);
        }
    }

    @OriginalMember(owner = "client!qb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 447)
    public final void keyTyped(KeyEvent arg0) {
        arg0.consume();
        field2501++;
    }
}
