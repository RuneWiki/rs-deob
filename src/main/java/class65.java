import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XHFSQKPU")
public class class65 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "XHFSQKPU", name = "a", descriptor = "I")
    private int field1609 = -962;

    @OriginalMember(owner = "XHFSQKPU", name = "b", descriptor = "I")
    private int field1610 = -658;

    @OriginalMember(owner = "XHFSQKPU", name = "c", descriptor = "I")
    private int field1611 = -572;

    @OriginalMember(owner = "XHFSQKPU", name = "e", descriptor = "Z")
    private boolean field1613 = true;

    @OriginalMember(owner = "XHFSQKPU", name = "g", descriptor = "I")
    private int field1615 = 20;

    @OriginalMember(owner = "XHFSQKPU", name = "h", descriptor = "I")
    public int field1616 = 1;

    @OriginalMember(owner = "XHFSQKPU", name = "i", descriptor = "[J")
    private long[] field1617 = new long[10];

    @OriginalMember(owner = "XHFSQKPU", name = "k", descriptor = "Z")
    public boolean field1619 = false;

    @OriginalMember(owner = "XHFSQKPU", name = "p", descriptor = "[LCUKAGIIJ;")
    public class10[] field1624 = new class10[6];

    @OriginalMember(owner = "XHFSQKPU", name = "r", descriptor = "Z")
    public boolean field1626 = true;

    @OriginalMember(owner = "XHFSQKPU", name = "s", descriptor = "Z")
    public boolean field1627 = true;

    @OriginalMember(owner = "XHFSQKPU", name = "F", descriptor = "[I")
    public int[] field1640 = new int[128];

    @OriginalMember(owner = "XHFSQKPU", name = "G", descriptor = "[I")
    private int[] field1641 = new int[128];

    @OriginalMember(owner = "XHFSQKPU", name = "d", descriptor = "I")
    private int field1612;

    @OriginalMember(owner = "XHFSQKPU", name = "f", descriptor = "I")
    private int field1614;

    @OriginalMember(owner = "XHFSQKPU", name = "j", descriptor = "I")
    public int field1618;

    @OriginalMember(owner = "XHFSQKPU", name = "l", descriptor = "I")
    public int field1620;

    @OriginalMember(owner = "XHFSQKPU", name = "m", descriptor = "I")
    public int field1621;

    @OriginalMember(owner = "XHFSQKPU", name = "t", descriptor = "I")
    public int field1628;

    @OriginalMember(owner = "XHFSQKPU", name = "u", descriptor = "I")
    public int field1629;

    @OriginalMember(owner = "XHFSQKPU", name = "v", descriptor = "I")
    public int field1630;

    @OriginalMember(owner = "XHFSQKPU", name = "w", descriptor = "I")
    public int field1631;

    @OriginalMember(owner = "XHFSQKPU", name = "x", descriptor = "I")
    public int field1632;

    @OriginalMember(owner = "XHFSQKPU", name = "y", descriptor = "I")
    public int field1633;

    @OriginalMember(owner = "XHFSQKPU", name = "z", descriptor = "I")
    public int field1634;

    @OriginalMember(owner = "XHFSQKPU", name = "B", descriptor = "I")
    public int field1636;

    @OriginalMember(owner = "XHFSQKPU", name = "C", descriptor = "I")
    public int field1637;

    @OriginalMember(owner = "XHFSQKPU", name = "D", descriptor = "I")
    public int field1638;

    @OriginalMember(owner = "XHFSQKPU", name = "H", descriptor = "I")
    private int field1642;

    @OriginalMember(owner = "XHFSQKPU", name = "I", descriptor = "I")
    private int field1643;

    @OriginalMember(owner = "XHFSQKPU", name = "J", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "XHFSQKPU", name = "A", descriptor = "J")
    public long field1635;

    @OriginalMember(owner = "XHFSQKPU", name = "E", descriptor = "J")
    public long field1639;

    @OriginalMember(owner = "XHFSQKPU", name = "o", descriptor = "LEDCVNWGU;")
    public class17 field1623;

    @OriginalMember(owner = "XHFSQKPU", name = "q", descriptor = "LHCBLGNPC;")
    public class26 field1625;

    @OriginalMember(owner = "XHFSQKPU", name = "n", descriptor = "Ljava/awt/Graphics;")
    public Graphics field1622;

    @OriginalMember(owner = "XHFSQKPU", name = "a", descriptor = "(III)V")
    public final void method577(int arg0, int arg1, int arg2) {
        this.field1620 = arg2;
        this.field1621 = arg0;
        this.field1625 = new class26(this.field1620, this.field1621, this, (byte) 26);
        this.field1622 = this.method149(true).getGraphics();
        this.field1623 = new class17(this.method149(true), -4368, this.field1621, this.field1620);
        this.method129(this, 1);
        if (arg1 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "XHFSQKPU", name = "b", descriptor = "(III)V")
    public final void method578(int arg0, int arg1, int arg2) {
        this.field1620 = arg2;
        if (arg1 == 4) {
            this.field1621 = arg0;
            this.field1622 = this.method149(true).getGraphics();
            this.field1623 = new class17(this.method149(true), -4368, this.field1621, this.field1620);
            this.method129(this, 1);
        }
    }

    @OriginalMember(owner = "XHFSQKPU", name = "run", descriptor = "()V")
    public void run() {
        this.method149(true).addMouseListener(this);
        this.method149(true).addMouseMotionListener(this);
        this.method149(true).addKeyListener(this);
        this.method149(true).addFocusListener(this);
        if (this.field1625 != null) {
            this.field1625.addWindowListener(this);
        }
        this.method206(9, 0, "Loading...");
        this.method178();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field1617[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field1614 < 0) {
                    if (this.field1614 == -1) {
                        this.method579(911);
                    }
                    return;
                }
                if (this.field1614 > 0) {
                    this.field1614--;
                    if (this.field1614 == 0) {
                        this.method579(911);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field1617[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field1617[var1]) {
                    var2 = (int) ((long) (this.field1615 * 2560) / (var11 - this.field1617[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field1615 - (var11 - this.field1617[var1]) / 10L);
                }
                if (var3 > this.field1615) {
                    var3 = this.field1615;
                }
                this.field1617[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field1617[var13] != 0L) {
                            this.field1617[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field1616) {
                    var3 = this.field1616;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field1636 = this.field1632;
                    this.field1637 = this.field1633;
                    this.field1638 = this.field1634;
                    this.field1639 = this.field1635;
                    this.field1632 = 0;
                    this.method118((byte) 4);
                    this.field1642 = this.field1643;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field1615 > 0) {
                    this.field1618 = var2 * 1000 / (this.field1615 * 256);
                }
                this.method99(350);
            } while (!this.field1619);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field1617[var15]);
            }
            System.out.println("fps:" + this.field1618 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field1615 + " mindel:" + this.field1616);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field1619 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "XHFSQKPU", name = "a", descriptor = "(I)V")
    public final void method579(int arg0) {
        this.field1614 = -2;
        int var2 = 33 / arg0;
        this.method163((byte) 1);
        if (this.field1625 == null) {
            return;
        }
        try {
            Thread.sleep(1000L);
        } catch (Exception var4) {
        }
        try {
            System.exit(0);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "XHFSQKPU", name = "a", descriptor = "(II)V")
    public final void method580(int arg0, int arg1) {
        if (arg1 >= 0) {
            this.field1613 = !this.field1613;
        }
        this.field1615 = 1000 / arg0;
    }

    @OriginalMember(owner = "XHFSQKPU", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field1614 >= 0) {
            this.field1614 = 0;
        }
    }

    @OriginalMember(owner = "XHFSQKPU", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field1614 >= 0) {
            this.field1614 = 4000 / this.field1615;
        }
    }

    @OriginalMember(owner = "XHFSQKPU", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field1614 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field1614 == -1) {
            this.method579(911);
        }
    }

    @OriginalMember(owner = "XHFSQKPU", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field1622 == null) {
            this.field1622 = arg0;
        }
        this.field1626 = true;
        this.method177(0);
    }

    @OriginalMember(owner = "XHFSQKPU", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field1622 == null) {
            this.field1622 = arg0;
        }
        this.field1626 = true;
        this.method177(0);
    }

    @OriginalMember(owner = "XHFSQKPU", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1625 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1628 = 0;
        this.field1633 = var2;
        this.field1634 = var3;
        this.field1635 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field1632 = 2;
            this.field1629 = 2;
        } else {
            this.field1632 = 1;
            this.field1629 = 1;
        }
    }

    @OriginalMember(owner = "XHFSQKPU", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field1628 = 0;
        this.field1629 = 0;
    }

    @OriginalMember(owner = "XHFSQKPU", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "XHFSQKPU", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "XHFSQKPU", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field1628 = 0;
        this.field1630 = -1;
        this.field1631 = -1;
    }

    @OriginalMember(owner = "XHFSQKPU", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1625 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1628 = 0;
        this.field1630 = var2;
        this.field1631 = var3;
    }

    @OriginalMember(owner = "XHFSQKPU", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1625 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1628 = 0;
        this.field1630 = var2;
        this.field1631 = var3;
    }

    @OriginalMember(owner = "XHFSQKPU", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field1628 = 0;
        int var2 = arg0.getKeyCode();
        int var3 = arg0.getKeyChar();
        if (var3 < 30) {
            var3 = 0;
        }
        if (var2 == 37) {
            var3 = 1;
        }
        if (var2 == 39) {
            var3 = 2;
        }
        if (var2 == 38) {
            var3 = 3;
        }
        if (var2 == 40) {
            var3 = 4;
        }
        if (var2 == 17) {
            var3 = 5;
        }
        if (var2 == 8) {
            var3 = 8;
        }
        if (var2 == 127) {
            var3 = 8;
        }
        if (var2 == 9) {
            var3 = 9;
        }
        if (var2 == 10) {
            var3 = 10;
        }
        if (var2 >= 112 && var2 <= 123) {
            var3 = var2 + 1008 - 112;
        }
        if (var2 == 36) {
            var3 = 1000;
        }
        if (var2 == 35) {
            var3 = 1001;
        }
        if (var2 == 33) {
            var3 = 1002;
        }
        if (var2 == 34) {
            var3 = 1003;
        }
        if (var3 > 0 && var3 < 128) {
            this.field1640[var3] = 1;
        }
        if (var3 > 4) {
            this.field1641[this.field1643] = var3;
            this.field1643 = this.field1643 + 1 & 0x7F;
        }
        if (class67.field1668) {
        }
    }

    @OriginalMember(owner = "XHFSQKPU", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field1628 = 0;
        int var2 = arg0.getKeyCode();
        char var3 = arg0.getKeyChar();
        if (var3 < '\u001E') {
            var3 = '\u0000';
        }
        if (var2 == 37) {
            var3 = '\u0001';
        }
        if (var2 == 39) {
            var3 = '\u0002';
        }
        if (var2 == 38) {
            var3 = '\u0003';
        }
        if (var2 == 40) {
            var3 = '\u0004';
        }
        if (var2 == 17) {
            var3 = '\u0005';
        }
        if (var2 == 8) {
            var3 = '\b';
        }
        if (var2 == 127) {
            var3 = '\b';
        }
        if (var2 == 9) {
            var3 = '\t';
        }
        if (var2 == 10) {
            var3 = '\n';
        }
        if (var3 > '\u0000' && var3 < '\u0080') {
            this.field1640[var3] = 0;
        }
    }

    @OriginalMember(owner = "XHFSQKPU", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "XHFSQKPU", name = "a", descriptor = "(Z)I")
    public final int method581(boolean arg0) {
        int var2 = -1;
        if (!arg0) {
            return this.field1609;
        }
        if (this.field1643 != this.field1642) {
            var2 = this.field1641[this.field1642];
            this.field1642 = this.field1642 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "XHFSQKPU", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field1627 = true;
        this.field1626 = true;
        this.method177(0);
    }

    @OriginalMember(owner = "XHFSQKPU", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field1627 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field1640[var2] = 0;
        }
    }

    @OriginalMember(owner = "XHFSQKPU", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "XHFSQKPU", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "XHFSQKPU", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "XHFSQKPU", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "XHFSQKPU", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "XHFSQKPU", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "XHFSQKPU", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "XHFSQKPU", name = "a", descriptor = "()V")
    public void method178() {
    }

    @OriginalMember(owner = "XHFSQKPU", name = "a", descriptor = "(B)V")
    public void method118(byte arg0) {
        if (arg0 != 4) {
            this.field1612 = 264;
        }
    }

    @OriginalMember(owner = "XHFSQKPU", name = "b", descriptor = "(B)V")
    public void method163(byte arg0) {
        if (arg0 == 1) {
            boolean var2 = false;
        } else {
            this.field1610 = 419;
        }
    }

    @OriginalMember(owner = "XHFSQKPU", name = "b", descriptor = "(I)V")
    public void method99(int arg0) {
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "XHFSQKPU", name = "c", descriptor = "(I)V")
    public void method177(int arg0) {
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "XHFSQKPU", name = "b", descriptor = "(Z)Ljava/awt/Component;")
    public Component method149(boolean arg0) {
        if (!arg0) {
            this.field1611 = 400;
        }
        return this.field1625 == null ? this : this.field1625;
    }

    @OriginalMember(owner = "XHFSQKPU", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method129(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "XHFSQKPU", name = "a", descriptor = "(IILjava/lang/String;)V")
    public void method206(int arg0, int arg1, String arg2) {
        while (this.field1622 == null) {
            this.field1622 = this.method149(true).getGraphics();
            try {
                this.method149(true).repaint();
            } catch (Exception var11) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var10) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method149(true).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method149(true).getFontMetrics(var6);
        if (arg0 < 9 || arg0 > 9) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (this.field1626) {
            this.field1622.setColor(Color.black);
            this.field1622.fillRect(0, 0, this.field1620, this.field1621);
            this.field1626 = false;
        }
        Color var8 = new Color(140, 17, 17);
        int var9 = this.field1621 / 2 - 18;
        this.field1622.setColor(var8);
        this.field1622.drawRect(this.field1620 / 2 - 152, var9, 304, 34);
        this.field1622.fillRect(this.field1620 / 2 - 150, var9 + 2, arg1 * 3, 30);
        this.field1622.setColor(Color.black);
        this.field1622.fillRect(arg1 * 3 + this.field1620 / 2 - 150, var9 + 2, 300 - arg1 * 3, 30);
        this.field1622.setFont(var4);
        this.field1622.setColor(Color.white);
        this.field1622.drawString(arg2, (this.field1620 - var5.stringWidth(arg2)) / 2, var9 + 22);
    }
}
