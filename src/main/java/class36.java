import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!t")
public class class36 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "Lta;")
    public static class37 field489 = class20.method87(-100, "null");

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "I")
    public static int field490 = 500;

    @OriginalMember(owner = "mapview!t", name = "d", descriptor = "Lta;")
    public static class37 field492 = class20.method87(-102, "Skirt Shop");

    @OriginalMember(owner = "mapview!t", name = "e", descriptor = "Lta;")
    public static class37 field493 = class20.method87(-125, "fonts");

    @OriginalMember(owner = "mapview!t", name = "g", descriptor = "J")
    public static volatile long field495 = 0L;

    @OriginalMember(owner = "mapview!t", name = "h", descriptor = "Lta;")
    public static class37 field496 = class20.method87(-122, "???");

    @OriginalMember(owner = "mapview!t", name = "f", descriptor = "Lta;")
    public static class37 field494 = class20.method87(-102, "Kebab Seller");

    @OriginalMember(owner = "mapview!t", name = "i", descriptor = "Lta;")
    public static class37 field497 = class20.method87(-112, "Makeover Mage");

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(I)V", line = 8)
    public static final void method218(int arg0) {
        class12 var1 = class21.field238;
        synchronized (class21.field238) {
            class23.field258 = class31.field456;
            if (class14.field152 >= 0) {
                while (class6.field71 != class14.field152) {
                    int var2 = class10.field109[class6.field71];
                    class6.field71 = class6.field71 + 1 & 0x7F;
                    if (var2 < 0) {
                        class21.field242[~var2] = false;
                    } else {
                        class21.field242[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class21.field242[var3] = false;
                }
                class14.field152 = class6.field71;
            }
            class31.field456 = class12.field136;
        }
        if (arg0 != 28448) {
            field492 = null;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 53)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class12.field140 != null) {
            class21.field244 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!t", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 81)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!t", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 94)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class12.field140 != null) {
            class31.field457 = arg0.getX();
            class5.field54 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!t", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 111)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class12.field140 != null) {
            class31.field459 = arg0.getX();
            class21.field241 = arg0.getY();
            if (arg0.isMetaDown()) {
                class26.field425 = 2;
                class21.field244 = 2;
            } else {
                class26.field425 = 1;
                class21.field244 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!t", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 144)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class12.field140 != null) {
            class21.field244 = 0;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(I)V", line = 162)
    public static void method219(int arg0) {
        field489 = null;
        field493 = null;
        field494 = null;
        field492 = null;
        if (arg0 == 0) {
            field496 = null;
            field497 = null;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 198)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class12.field140 != null) {
            class31.field457 = -1;
            class5.field54 = -1;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 226)
    public static final String method220(int arg0, Throwable arg1) throws IOException {
        String var3;
        if (arg1 instanceof class18) {
            class18 var2 = (class18) arg1;
            var3 = var2.field179 + " | ";
            arg1 = var2.field180;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        if (arg0 != 4409) {
            method219(-58);
        }
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var11 = var9.indexOf(40);
                int var12 = var9.indexOf(41, var11 + 1);
                if (var11 >= 0 && var12 >= 0) {
                    String var13 = var9.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (var14 >= 0) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                        var3 = var3 + var15 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var11);
                }
                String var16 = var9.trim();
                String var17 = var16.substring(var16.lastIndexOf(32) + 1);
                String var18 = var17.substring(var17.lastIndexOf(9) + 1);
                var3 = var3 + var18 + ' ';
            }
        }
    }

    @OriginalMember(owner = "mapview!t", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 295)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!t", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 304)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class12.field140 != null) {
            class31.field457 = arg0.getX();
            class5.field54 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Z)B", line = 321)
    public static final byte method221(boolean arg0) {
        if (!arg0) {
            field497 = null;
        }
        return class40.field532 == null ? 0 : class40.field532[class11.field127];
    }

    @OriginalMember(owner = "mapview!t", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 336)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class12.field140 != null) {
            class31.field457 = arg0.getX();
            class5.field54 = arg0.getY();
        }
    }
}
