import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class16 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Loa;")
    public static class98 field329 = class38.method349(255, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Loa;")
    public static class98 field322 = class38.method349(255, "::gc");

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "Loa;")
    public static class98 field332 = class38.method349(255, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Loa;")
    public static class98 field325 = class38.method349(255, "Spiel)2Fenster geladen)3");

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "Ltd;")
    public static class132 field334 = null;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "[[[I")
    public static int[][][] field336 = new int[4][13][13];

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!ca", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field331++;
        if (class141.field3436 != null) {
            class15.field319 = -1;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILoa;)I")
    public static final int method156(int arg0, class98 arg1) {
        field333++;
        if (class139.field3391 == 1) {
            return 7;
        } else if (arg1.method792((byte) -84, class112.field2515)) {
            return 1;
        } else if (arg1.method792((byte) -84, class111.field2488)) {
            return 1;
        } else if (arg1.method792((byte) -84, class102.field2356)) {
            return 2;
        } else if (arg1.method792((byte) -84, class115.field2597)) {
            return 2;
        } else if (arg1.method792((byte) -84, class36.field894)) {
            return 3;
        } else {
            int var2 = -121 % ((arg0 - 9) / 49);
            if (arg1.method792((byte) -84, class49.field1095)) {
                return 4;
            } else if (arg1.method792((byte) -84, class39.field941)) {
                return 5;
            } else if (arg1.method792((byte) -84, class38.field940)) {
                return 6;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
    public static void method157(byte arg0) {
        field334 = null;
        if (arg0 != -30) {
            method158(52);
        }
        field322 = null;
        field329 = null;
        field332 = null;
        field325 = null;
        field336 = null;
    }

    @OriginalMember(owner = "client!ca", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field323++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!ca", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class141.field3436 != null) {
            class114.field2582 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class73.field1522.length > var2) {
                var3 = class73.field1522[var2];
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
                var4 = class18.method179(arg0, -65);
            }
            if (class15.field319 >= 0 && var3 >= 0) {
                class52.field1158[class15.field319] = var3;
                class15.field319 = class15.field319 + 1 & 0x7F;
                if (class71.field1476 == class15.field319) {
                    class15.field319 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class135.field3289 + 1 & 0x7F;
                if (class30.field697 != var5) {
                    class1.field3[class135.field3289] = var3;
                    class149.field3676[class135.field3289] = var4;
                    class135.field3289 = var5;
                }
            }
        }
        field337++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static final void method158(int arg0) {
        field327++;
        int var1 = class36.field890.method175(-125, 8);
        if (var1 < class131.field3082) {
            for (int var2 = var1; var2 < class131.field3082; var2++) {
                class8.field190[class58.field1278++] = class65.field1394[var2];
            }
        }
        if (class131.field3082 < var1) {
            throw new RuntimeException("gppov1");
        }
        class131.field3082 = 0;
        if (arg0 < 96) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class65.field1394[var3];
            class55 var5 = class33.field832[var4];
            int var6 = class36.field890.method175(-121, 1);
            if (var6 == 0) {
                class65.field1394[class131.field3082++] = var4;
                var5.field3609 = class119.field2680;
            } else {
                int var7 = class36.field890.method175(115, 2);
                if (var7 == 0) {
                    class65.field1394[class131.field3082++] = var4;
                    var5.field3609 = class119.field2680;
                    class96.field2205[class74.field1603++] = var4;
                } else if (var7 == 1) {
                    class65.field1394[class131.field3082++] = var4;
                    var5.field3609 = class119.field2680;
                    int var8 = class36.field890.method175(-128, 3);
                    var5.method1182(false, (byte) 67, var8);
                    int var9 = class36.field890.method175(26, 1);
                    if (var9 == 1) {
                        class96.field2205[class74.field1603++] = var4;
                    }
                } else if (var7 == 2) {
                    class65.field1394[class131.field3082++] = var4;
                    var5.field3609 = class119.field2680;
                    int var10 = class36.field890.method175(-127, 3);
                    var5.method1182(true, (byte) 91, var10);
                    int var11 = class36.field890.method175(90, 3);
                    var5.method1182(true, (byte) 83, var11);
                    int var12 = class36.field890.method175(-1, 1);
                    if (var12 == 1) {
                        class96.field2205[class74.field1603++] = var4;
                    }
                } else if (var7 == 3) {
                    class8.field190[class58.field1278++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field328++;
        if (class141.field3436 != null) {
            class114.field2582 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class73.field1522.length) {
                var3 = class73.field1522[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class15.field319 >= 0 && var3 >= 0) {
                class52.field1158[class15.field319] = ~var3;
                class15.field319 = class15.field319 + 1 & 0x7F;
                if (class71.field1476 == class15.field319) {
                    class15.field319 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)Z")
    public static final boolean method159(byte arg0, int arg1) {
        field335++;
        if (arg0 == -14) {
            return (arg1 >> 20 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ca", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field330++;
    }
}
