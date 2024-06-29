import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class17 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field254 = 100;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field255 = 0;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field257 = 1;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field259 = 0;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Lmb;")
    public static class132 field247 = class166.method1092("Keine Antwort vom Anmelde)2Server)3", 113);

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "[Lvi;")
    public static class233[] field249;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "[Lvi;")
    public static class233[] field261;

    @OriginalMember(owner = "client!be", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class69.field1147 != null) {
            class210.field3843 = 0;
            class82.field1384 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field244++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
    public static final void method87(boolean arg0) {
        field245++;
        class152 var1 = (class152) class200.field3697.method119(true);
        if (arg0) {
            field249 = null;
        }
        while (var1 != null) {
            class11 var2 = var1.field2774;
            if (class139.field2615 != var2.field138 || class30.field460 > var2.field146) {
                var1.method995((byte) -116);
            } else if (class30.field460 >= var2.field153) {
                if (var2.field141 > 0) {
                    class65 var3 = class11.field145[var2.field141 - 1];
                    if (var3 != null && var3.field673 >= 0 && var3.field673 < 13312 && var3.field723 >= 0 && var3.field723 < 13312) {
                        var2.method54(1, var3.field673, class30.field460, class195.method1239(var3.field723, var2.field138, false, var3.field673) - var2.field144, var3.field723);
                    }
                }
                if (var2.field141 < 0) {
                    int var4 = -var2.field141 - 1;
                    class159 var5;
                    if (class65.field1069 == var4) {
                        var5 = class210.field3854;
                    } else {
                        var5 = class68.field1120[var4];
                    }
                    if (var5 != null && var5.field673 >= 0 && var5.field673 < 13312 && var5.field723 >= 0 && var5.field723 < 13312) {
                        var2.method54(1, var5.field673, class30.field460, class195.method1239(var5.field723, var2.field138, false, var5.field673) - var2.field144, var5.field723);
                    }
                }
                var2.method56(true, class112.field2118);
                class35.method249(class139.field2615, (int) var2.field137, (int) var2.field135, (int) var2.field125, 60, var2, var2.field133, -1L, false);
            }
            var1 = (class152) class200.field3697.method125((byte) -23);
        }
    }

    @OriginalMember(owner = "client!be", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class69.field1147 != null) {
            class210.field3843 = 0;
            class85.field1486 = arg0.getX();
            class65.field1080 = arg0.getY();
        }
        field248++;
    }

    @OriginalMember(owner = "client!be", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field262++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!be", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class69.field1147 != null) {
            class210.field3843 = 0;
            class85.field1486 = arg0.getX();
            class65.field1080 = arg0.getY();
        }
        field251++;
    }

    @OriginalMember(owner = "client!be", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field250++;
    }

    @OriginalMember(owner = "client!be", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field252++;
        if (class69.field1147 != null) {
            class210.field3843 = 0;
            class96.field1692 = arg0.getX();
            class16.field231 = arg0.getY();
            class131.field2415 = class113.method769(71);
            if (arg0.isMetaDown()) {
                class75.field1246 = 2;
                class82.field1384 = 2;
            } else {
                class75.field1246 = 1;
                class82.field1384 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static void method88(int arg0) {
        field261 = null;
        field249 = null;
        if (arg0 != 9869) {
            field249 = null;
        }
        field247 = null;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
    public static final void method89(int arg0) {
        class26.method196(0);
        field258++;
        class192.method1227(70);
        class95.method590(4096);
        class86.method541(-1);
        if (arg0 < 94) {
            return;
        }
        class63.method401(0);
        class227.method1449(-1);
        class164.method1061((byte) 125);
        class8.method35((byte) 116);
        class129.method846(-128);
        class240.method1536((byte) 124);
        class81.method496(-3);
        class214.method1334((byte) -75);
        ((class170) class50.field859).method1111(false);
        class25.field406.method778((byte) 122);
        class55.field943.method1088(74);
        class161.field2926.method1088(77);
        class192.field3581.method1088(110);
        class139.field2600.method1088(-62);
        class168.field3077.method1088(-50);
        class69.field1161.method1088(69);
        class139.field2616.method1088(-45);
        class65.field1068.method1088(-126);
        class62.field1043.method1088(82);
        class171.field3196.method1088(90);
        class200.field3690.method1088(-52);
    }

    @OriginalMember(owner = "client!be", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class69.field1147 != null) {
            class210.field3843 = 0;
            class85.field1486 = arg0.getX();
            class65.field1080 = arg0.getY();
        }
        field260++;
    }

    @OriginalMember(owner = "client!be", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class69.field1147 != null) {
            class82.field1384 = 0;
        }
        field256++;
    }

    @OriginalMember(owner = "client!be", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field243++;
        if (class69.field1147 != null) {
            class210.field3843 = 0;
            class85.field1486 = -1;
            class65.field1080 = -1;
        }
    }
}
