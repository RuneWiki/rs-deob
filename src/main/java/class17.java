import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!i")
public class class17 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "mapview!i", name = "d", descriptor = "[I")
    public static int[] field197 = new int[128];

    @OriginalMember(owner = "mapview!i", name = "c", descriptor = "Lt;")
    public static class35 field196 = class3.method28(false, "null");

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "[I")
    public static int[] field195 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "Lt;")
    public static class35 field194 = class3.method28(false, "Mining Shop");

    @OriginalMember(owner = "mapview!i", name = "e", descriptor = "I")
    public static int field198 = 0;

    @OriginalMember(owner = "mapview!i", name = "f", descriptor = "Lt;")
    public static class35 field199 = class3.method28(false, "General Store");

    @OriginalMember(owner = "mapview!i", name = "g", descriptor = "Lt;")
    public static class35 field200 = class3.method28(false, "Silk Trader");

    @OriginalMember(owner = "mapview!i", name = "h", descriptor = "Lt;")
    public static class35 field201 = class3.method28(false, "Apothecary");

    @OriginalMember(owner = "mapview!i", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 5)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class31.field393 != null) {
            class32.field402 = arg0.getX();
            class13.field165 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(B[B)V", line = 27)
    public static final void method100(byte arg0, byte[] arg1) {
        class18 var2 = new class18(arg1);
        var2.field203 = arg1.length - 2;
        class16.field189 = var2.method113((byte) 24);
        class36.field448 = new int[class16.field189];
        class13.field174 = new byte[class16.field189][];
        class2.field67 = new int[class16.field189];
        class34.field426 = new int[class16.field189];
        class30.field341 = new int[class16.field189];
        var2.field203 = arg1.length - class16.field189 * 8 - 7;
        class23.field258 = var2.method113((byte) 25);
        class15.field177 = var2.method113((byte) -51);
        int var3 = (var2.method110(54) & 0xFF) + 1;
        for (int var4 = 0; var4 < class16.field189; var4++) {
            class34.field426[var4] = var2.method113((byte) 120);
        }
        for (int var5 = 0; var5 < class16.field189; var5++) {
            class30.field341[var5] = var2.method113((byte) -49);
        }
        for (int var6 = 0; var6 < class16.field189; var6++) {
            class36.field448[var6] = var2.method113((byte) -23);
        }
        for (int var7 = 0; var7 < class16.field189; var7++) {
            class2.field67[var7] = var2.method113((byte) -70);
        }
        var2.field203 = arg1.length + 3 - class16.field189 * 8 - var3 * 3 - 7;
        class24.field275 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class24.field275[var8] = var2.method111(class31.method177(arg0, -16711794));
            if (class24.field275[var8] == 0) {
                class24.field275[var8] = 1;
            }
        }
        if (arg0 != -114) {
            field196 = null;
        }
        var2.field203 = 0;
        for (int var9 = 0; var9 < class16.field189; var9++) {
            int var10 = class36.field448[var9];
            int var11 = class2.field67[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class13.field174[var9] = var13;
            int var14 = var2.method110(76);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method105((byte) 126);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var10; var16++) {
                    for (int var17 = 0; var17 < var11; var17++) {
                        var13[var16 + var10 * var17] = var2.method105((byte) 103);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(B)V", line = 146)
    public static void method101(byte arg0) {
        field201 = null;
        field200 = null;
        field195 = null;
        field197 = null;
        field196 = null;
        field199 = null;
        if (arg0 <= -115) {
            field194 = null;
        }
    }

    @OriginalMember(owner = "mapview!i", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 166)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class31.field393 != null) {
            class32.field402 = arg0.getX();
            class13.field165 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!i", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 182)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class31.field393 != null) {
            class32.field402 = arg0.getX();
            class13.field165 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V", line = 208)
    public static final void method102(String arg0, Throwable arg1, int arg2) {
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class36.method229(arg1, arg2 ^ 0xFFFFBEB0);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            class4 var8 = class19.field216.method76(new URL(class19.field216.field145.getCodeBase(), "clienterror.ws?c=" + class7.field115 + "&u=" + class6.field109 + "&v1=" + class10.field139 + "&v2=" + class10.field151 + "&e=" + var7), 26);
            while (var8.field81 == 0) {
                class27.method152((byte) 124, 1L);
            }
            if (var8.field81 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field82;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
        if (arg2 != -16715) {
            method103(-35, null);
        }
    }

    @OriginalMember(owner = "mapview!i", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 259)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class31.field393 != null) {
            class36.field452 = 0;
        }
    }

    @OriginalMember(owner = "mapview!i", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 270)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class31.field393 != null) {
            class5.field97 = arg0.getX();
            class3.field73 = arg0.getY();
            if (arg0.isMetaDown()) {
                class33.field416 = 2;
                class36.field452 = 2;
            } else {
                class33.field416 = 1;
                class36.field452 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!i", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 305)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 312)
    public static final void method103(int arg0, Component arg1) {
        arg1.removeKeyListener(class26.field302);
        arg1.removeFocusListener(class26.field302);
        if (arg0 != 105) {
            field196 = null;
        }
    }

    @OriginalMember(owner = "mapview!i", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 335)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!i", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 348)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class31.field393 != null) {
            class36.field452 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!i", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 382)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class31.field393 != null) {
            class32.field402 = -1;
            class13.field165 = -1;
        }
    }
}
