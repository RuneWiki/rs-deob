import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class61 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "[[I")
    public static int[][] field1300 = new int[104][104];

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "[[B")
    public static byte[][] field1296 = new byte[50][];

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "[I")
    public static int[] field1301 = new int[500];

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "Ltd;")
    public static class136 field1302 = class145.method1172("hel", 45);

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field1304 = 0;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "[Z")
    public static boolean[] field1292 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "[I")
    public static int[] field1297 = new int[200];

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "[Ltd;")
    public static class136[] field1298 = new class136[100];

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "Ltd;")
    public static class136 field1308 = class145.method1172("Keine Antwort vom Anmelde)2Server)3", 45);

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "Ltd;")
    public static class136 field1310 = class145.method1172("<col=00ff80>", 45);

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "Ltd;")
    public static class136 field1312 = class145.method1172(":duelreq:", 45);

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "Ltd;")
    public static class136 field1314 = null;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!ie", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field1295++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ie", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1299++;
        if (class90.field2132 != null) {
            class154.field3520 = 0;
            class86.field2008 = arg0.getX();
            class89.field2108 = arg0.getY();
            class89.field2115 = class27.method233((byte) 104);
            if (arg0.isMetaDown()) {
                class120.field2746 = 2;
                class54.field1205 = 2;
            } else {
                class120.field2746 = 1;
                class54.field1205 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ie", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1313++;
        if (class90.field2132 != null) {
            class154.field3520 = 0;
            class54.field1205 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ie", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1294++;
        if (class90.field2132 != null) {
            class54.field1205 = 0;
        }
    }

    @OriginalMember(owner = "client!ie", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class90.field2132 != null) {
            class154.field3520 = 0;
            class76.field1715 = arg0.getX();
            class131.field3102 = arg0.getY();
        }
        field1305++;
    }

    @OriginalMember(owner = "client!ie", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field1309++;
        if (class90.field2132 != null) {
            class154.field3520 = 0;
            class76.field1715 = arg0.getX();
            class131.field3102 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ie", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class90.field2132 != null) {
            class154.field3520 = 0;
            class76.field1715 = arg0.getX();
            class131.field3102 = arg0.getY();
        }
        field1311++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public static void method463(int arg0) {
        field1298 = null;
        field1300 = null;
        field1301 = null;
        field1312 = null;
        if (arg0 < 21) {
            field1310 = null;
        }
        field1308 = null;
        field1314 = null;
        field1292 = null;
        field1297 = null;
        field1296 = null;
        field1310 = null;
        field1302 = null;
    }

    @OriginalMember(owner = "client!ie", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class90.field2132 != null) {
            class154.field3520 = 0;
            class76.field1715 = -1;
            class131.field3102 = -1;
        }
        field1303++;
    }

    @OriginalMember(owner = "client!ie", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1293++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILnf;IIB)V")
    public static final void method464(int arg0, class96 arg1, int arg2, int arg3, byte arg4) {
        field1306++;
        if (class14.field274 >= 400) {
            return;
        }
        if (arg1.field2258 != null) {
            arg1 = arg1.method732((byte) -114);
        }
        if (arg1 == null || !arg1.field2270) {
            return;
        }
        class136 var5 = arg1.field2303;
        if (arg1.field2295 != 0) {
            var5 = class79.method570(0, new class136[] { var5, class63.method473(8374, class24.field555.field255, arg1.field2295), class39.field922, class96.field2276, class19.method140(arg1.field2295, arg4 - 32), class106.field2492 });
        }
        if (arg4 != -87) {
            return;
        }
        if (class147.field3410 == 1) {
            class19.method134(arg4 ^ 0x28, 15, arg0, class152.field3483, class79.method570(0, new class136[] { class49.field1126, class141.field3277, var5 }), arg3, arg2);
            class139.field3246++;
        } else if (!class40.field933) {
            class89.field2112++;
            class136[] var6 = arg1.field2257;
            if (class80.field1845) {
                var6 = class147.method1182(true, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method1092(arg4 + 1940, class125.field2899)) {
                        class94.field2208++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 24;
                        }
                        if (var7 == 1) {
                            var8 = 19;
                        }
                        if (var7 == 2) {
                            var8 = 40;
                        }
                        if (var7 == 3) {
                            var8 = 35;
                        }
                        if (var7 == 4) {
                            var8 = 30;
                        }
                        class19.method134(-127, var8, arg0, var6[var7], class79.method570(0, new class136[] { class101.field2418, var5 }), arg3, arg2);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method1092(1853, class125.field2899)) {
                        class79.field1812++;
                        int var10 = 0;
                        short var11 = 0;
                        if (arg1.field2295 > class24.field555.field255) {
                            var11 = 2000;
                        }
                        if (var9 == 0) {
                            var10 = var11 + 24;
                        }
                        if (var9 == 1) {
                            var10 = var11 + 19;
                        }
                        if (var9 == 2) {
                            var10 = var11 + 40;
                        }
                        if (var9 == 3) {
                            var10 = var11 + 35;
                        }
                        if (var9 == 4) {
                            var10 = var11 + 30;
                        }
                        class19.method134(arg4 ^ 0x2A, var10, arg0, var6[var9], class79.method570(0, new class136[] { class101.field2418, var5 }), arg3, arg2);
                    }
                }
            }
            class19.method134(-113, 1007, arg0, class106.field2496, class79.method570(arg4 + 87, new class136[] { class101.field2418, var5 }), arg3, arg2);
        } else if ((class5.field97 & 0x2) == 2) {
            class19.method134(-114, 16, arg0, class27.field602, class79.method570(arg4 + 87, new class136[] { class28.field620, class141.field3277, var5 }), arg3, arg2);
            class85.field1993++;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)I")
    public static final int method465(byte arg0) {
        if (arg0 != 27) {
            field1304 = 114;
        }
        field1291++;
        int var1 = class65.method486(class62.field1331, (byte) -42, class100.field2409, class9.field168);
        return var1 - class28.field621 >= 800 || (class125.field2895[class62.field1331][class9.field168 >> 7][class100.field2409 >> 7] & 0x4) == 0 ? 3 : class62.field1331;
    }
}
