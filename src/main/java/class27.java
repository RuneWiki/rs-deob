import java.awt.Canvas;
import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!p")
public class class27 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "mapview!p", name = "f", descriptor = "Ll;")
    public static class21 field325 = class28.method185(-20839, "Key");

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "Z")
    public static volatile boolean field322 = false;

    @OriginalMember(owner = "mapview!p", name = "g", descriptor = "[J")
    public static long[] field326 = new long[32];

    @OriginalMember(owner = "mapview!p", name = "h", descriptor = "Ll;")
    public static class21 field327 = class28.method185(-20839, "Saw Mill");

    @OriginalMember(owner = "mapview!p", name = "i", descriptor = "Ll;")
    public static class21 field328 = class28.method185(-20839, "Mining Site");

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "mapview!p", name = "e", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field324;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field320;

    @OriginalMember(owner = "mapview!p", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 12)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!p", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 32)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class29.field342 != null) {
            class26.field318 = arg0.getX();
            class26.field319 = arg0.getY();
            if (arg0.isMetaDown()) {
                class10.field71 = 2;
                class17.field154 = 2;
            } else {
                class10.field71 = 1;
                class17.field154 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 74)
    public static final String method176(int arg0, Throwable arg1) throws IOException {
        String var2;
        if (arg1 instanceof class30) {
            class30 var3 = (class30) arg1;
            var2 = var3.field350 + " | ";
            arg1 = var3.field353;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        if (arg0 != 0) {
            method178(117);
        }
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 154)
    public static final void method177(Component arg0, int arg1) {
        try {
            if (arg1 != 1) {
                return;
            }
            Method var2 = class32.field367;
            if (var2 != null) {
                var2.invoke(arg0, Boolean.FALSE);
            }
        } catch (Throwable var4) {
        }
        arg0.addKeyListener(class5.field38);
        arg0.addFocusListener(class5.field38);
    }

    @OriginalMember(owner = "mapview!p", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 172)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class29.field342 != null) {
            class2.field8 = arg0.getX();
            class20.field188 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!p", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 187)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class29.field342 != null) {
            class2.field8 = arg0.getX();
            class20.field188 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!p", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 204)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class29.field342 != null) {
            class2.field8 = arg0.getX();
            class20.field188 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(I)V", line = 232)
    public static void method178(int arg0) {
        field320 = null;
        field326 = null;
        field328 = null;
        field325 = null;
        field327 = null;
        field324 = null;
        if (arg0 != -29056) {
            field328 = null;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 248)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class29.field342 != null) {
            class17.field154 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!p", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 266)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class29.field342 != null) {
            class2.field8 = -1;
            class20.field188 = -1;
        }
    }
}
