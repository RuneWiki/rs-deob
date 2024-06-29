import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class125 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "Z")
    public static boolean field2094 = false;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "[I")
    public static int[] field2092 = new int[4096];

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "Leg;")
    public static class37 field2097 = class174.method1167(")4a=", -67);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "[I")
    public static int[] field2101;

    @OriginalMember(owner = "client!rd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2096++;
        if (class233.field4017 != null) {
            class62.field1019 = 0;
            class59.field959 = arg0.getX();
            class180.field3003 = arg0.getY();
            class286.field5049 = class149.method1024(-14898);
            if (arg0.isMetaDown()) {
                class83.field1301 = 2;
                class35.field497 = 2;
            } else {
                class83.field1301 = 1;
                class35.field497 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2090++;
    }

    @OriginalMember(owner = "client!rd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2091++;
    }

    @OriginalMember(owner = "client!rd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class233.field4017 != null) {
            class62.field1019 = 0;
            class95.field1489 = arg0.getX();
            class264.field4644 = arg0.getY();
        }
        field2089++;
    }

    @OriginalMember(owner = "client!rd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class233.field4017 != null) {
            class35.field497 = 0;
        }
        field2087++;
    }

    @OriginalMember(owner = "client!rd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2095++;
        if (class233.field4017 != null) {
            class62.field1019 = 0;
            class35.field497 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static void method896(int arg0) {
        field2097 = null;
        if (arg0 != -1) {
            method897(-45, (class237[]) null, 6);
        }
        field2092 = null;
        field2101 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[Lpe;I)V")
    public static final void method897(int arg0, class237[] arg1, int arg2) {
        field2099++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class237 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field4228 == 0) {
                    if (var4.field4194 != null) {
                        method897(arg0, var4.field4194, -27256);
                    }
                    class190 var5 = (class190) class120.field2022.method992((byte) 125, (long) var4.field4211);
                    if (var5 != null) {
                        class175.method1175(-499336730, var5.field3259, arg0);
                    }
                }
                if (arg0 == 0 && var4.field4109 != null) {
                    class85 var6 = new class85();
                    var6.field1346 = var4;
                    var6.field1339 = var4.field4109;
                    class274.method1841(var6, 50);
                }
                if (arg0 == 1 && var4.field4075 != null) {
                    if (var4.field4120 >= 0) {
                        class237 var7 = class156.method1066(arg2 ^ 0x6A1F, var4.field4211);
                        if (var7 == null || var7.field4194 == null || var4.field4120 >= var7.field4194.length || var7.field4194[var4.field4120] != var4) {
                            continue;
                        }
                    }
                    class85 var8 = new class85();
                    var8.field1346 = var4;
                    var8.field1339 = var4.field4075;
                    class274.method1841(var8, 76);
                }
            }
        }
        if (arg2 != -27256) {
            field2101 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class233.field4017 != null) {
            class62.field1019 = 0;
            class95.field1489 = -1;
            class264.field4644 = -1;
        }
        field2098++;
    }

    @OriginalMember(owner = "client!rd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class233.field4017 != null) {
            class62.field1019 = 0;
            class95.field1489 = arg0.getX();
            class264.field4644 = arg0.getY();
        }
        field2100++;
    }

    @OriginalMember(owner = "client!rd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class233.field4017 != null) {
            class62.field1019 = 0;
            class95.field1489 = arg0.getX();
            class264.field4644 = arg0.getY();
        }
        field2088++;
    }
}
