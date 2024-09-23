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

@OriginalClass("ZAMJOSBM")
public class class71 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "ZAMJOSBM", name = "a", descriptor = "Z")
    private boolean field1638 = true;

    @OriginalMember(owner = "ZAMJOSBM", name = "b", descriptor = "I")
    private int field1639 = 9;

    @OriginalMember(owner = "ZAMJOSBM", name = "c", descriptor = "I")
    private int field1640 = 1;

    @OriginalMember(owner = "ZAMJOSBM", name = "d", descriptor = "Z")
    private boolean field1641 = true;

    @OriginalMember(owner = "ZAMJOSBM", name = "f", descriptor = "I")
    private int field1643 = 20;

    @OriginalMember(owner = "ZAMJOSBM", name = "g", descriptor = "I")
    public int field1644 = 1;

    @OriginalMember(owner = "ZAMJOSBM", name = "h", descriptor = "[J")
    private long[] field1645 = new long[10];

    @OriginalMember(owner = "ZAMJOSBM", name = "j", descriptor = "Z")
    public boolean field1647 = false;

    @OriginalMember(owner = "ZAMJOSBM", name = "o", descriptor = "[LUFHMHWIH;")
    public class55[] field1652 = new class55[6];

    @OriginalMember(owner = "ZAMJOSBM", name = "q", descriptor = "Z")
    public boolean field1654 = true;

    @OriginalMember(owner = "ZAMJOSBM", name = "r", descriptor = "Z")
    public boolean field1655 = true;

    @OriginalMember(owner = "ZAMJOSBM", name = "E", descriptor = "[I")
    public int[] field1668 = new int[128];

    @OriginalMember(owner = "ZAMJOSBM", name = "F", descriptor = "[I")
    private int[] field1669 = new int[128];

    @OriginalMember(owner = "ZAMJOSBM", name = "e", descriptor = "I")
    private int field1642;

    @OriginalMember(owner = "ZAMJOSBM", name = "i", descriptor = "I")
    public int field1646;

    @OriginalMember(owner = "ZAMJOSBM", name = "k", descriptor = "I")
    public int field1648;

    @OriginalMember(owner = "ZAMJOSBM", name = "l", descriptor = "I")
    public int field1649;

    @OriginalMember(owner = "ZAMJOSBM", name = "s", descriptor = "I")
    public int field1656;

    @OriginalMember(owner = "ZAMJOSBM", name = "t", descriptor = "I")
    public int field1657;

    @OriginalMember(owner = "ZAMJOSBM", name = "u", descriptor = "I")
    public int field1658;

    @OriginalMember(owner = "ZAMJOSBM", name = "v", descriptor = "I")
    public int field1659;

    @OriginalMember(owner = "ZAMJOSBM", name = "w", descriptor = "I")
    public int field1660;

    @OriginalMember(owner = "ZAMJOSBM", name = "x", descriptor = "I")
    public int field1661;

    @OriginalMember(owner = "ZAMJOSBM", name = "y", descriptor = "I")
    public int field1662;

    @OriginalMember(owner = "ZAMJOSBM", name = "A", descriptor = "I")
    public int field1664;

    @OriginalMember(owner = "ZAMJOSBM", name = "B", descriptor = "I")
    public int field1665;

    @OriginalMember(owner = "ZAMJOSBM", name = "C", descriptor = "I")
    public int field1666;

    @OriginalMember(owner = "ZAMJOSBM", name = "G", descriptor = "I")
    private int field1670;

    @OriginalMember(owner = "ZAMJOSBM", name = "H", descriptor = "I")
    private int field1671;

    @OriginalMember(owner = "ZAMJOSBM", name = "I", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "ZAMJOSBM", name = "z", descriptor = "J")
    public long field1663;

    @OriginalMember(owner = "ZAMJOSBM", name = "D", descriptor = "J")
    public long field1667;

    @OriginalMember(owner = "ZAMJOSBM", name = "p", descriptor = "LVZVCZYAB;")
    public class61 field1653;

    @OriginalMember(owner = "ZAMJOSBM", name = "n", descriptor = "LCPJIVKZX;")
    public class7 field1651;

    @OriginalMember(owner = "ZAMJOSBM", name = "m", descriptor = "Ljava/awt/Graphics;")
    public Graphics field1650;

    @OriginalMember(owner = "ZAMJOSBM", name = "a", descriptor = "(IIZ)V")
    public final void method576(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return;
        }
        this.field1648 = arg1;
        this.field1649 = arg0;
        this.field1653 = new class61(-5, this, this.field1648, this.field1649);
        this.field1650 = this.method42(1).getGraphics();
        this.field1651 = new class7(this.field1648, -158, this.field1649, this.method42(1));
        this.method97(this, 1);
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "a", descriptor = "(III)V")
    public final void method577(int arg0, int arg1, int arg2) {
        this.field1648 = arg1;
        this.field1649 = arg2;
        this.field1650 = this.method42(1).getGraphics();
        this.field1651 = new class7(this.field1648, -158, this.field1649, this.method42(1));
        if (arg0 == 0) {
            this.method97(this, 1);
        }
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "run", descriptor = "()V")
    public void run() {
        this.method42(1).addMouseListener(this);
        this.method42(1).addMouseMotionListener(this);
        this.method42(1).addKeyListener(this);
        this.method42(1).addFocusListener(this);
        if (this.field1653 != null) {
            this.field1653.addWindowListener(this);
        }
        this.method87("Loading...", 0, (byte) 9);
        this.method70();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field1645[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field1642 < 0) {
                    if (this.field1642 == -1) {
                        this.method578(9);
                    }
                    return;
                }
                if (this.field1642 > 0) {
                    this.field1642--;
                    if (this.field1642 == 0) {
                        this.method578(9);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field1645[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field1645[var1]) {
                    var2 = (int) ((long) (this.field1643 * 2560) / (var11 - this.field1645[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field1643 - (var11 - this.field1645[var1]) / 10L);
                }
                if (var3 > this.field1643) {
                    var3 = this.field1643;
                }
                this.field1645[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field1645[var13] != 0L) {
                            this.field1645[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field1644) {
                    var3 = this.field1644;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field1664 = this.field1660;
                    this.field1665 = this.field1661;
                    this.field1666 = this.field1662;
                    this.field1667 = this.field1663;
                    this.field1660 = 0;
                    this.method63((byte) -35);
                    this.field1670 = this.field1671;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field1643 > 0) {
                    this.field1646 = var2 * 1000 / (this.field1643 * 256);
                }
                this.method152(734);
            } while (!this.field1647);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field1645[var15]);
            }
            System.out.println("fps:" + this.field1646 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field1643 + " mindel:" + this.field1644);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field1647 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "a", descriptor = "(I)V")
    public final void method578(int arg0) {
        this.field1642 = -2;
        this.method96((byte) 0);
        if (arg0 < this.field1639 || arg0 > this.field1639) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (this.field1653 == null) {
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

    @OriginalMember(owner = "ZAMJOSBM", name = "a", descriptor = "(ZI)V")
    public final void method579(boolean arg0, int arg1) {
        this.field1643 = 1000 / arg1;
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field1642 >= 0) {
            this.field1642 = 0;
        }
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field1642 >= 0) {
            this.field1642 = 4000 / this.field1643;
        }
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field1642 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field1642 == -1) {
            this.method578(9);
        }
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field1650 == null) {
            this.field1650 = arg0;
        }
        this.field1654 = true;
        this.method46(1);
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field1650 == null) {
            this.field1650 = arg0;
        }
        this.field1654 = true;
        this.method46(1);
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1653 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1656 = 0;
        this.field1661 = var2;
        this.field1662 = var3;
        this.field1663 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field1660 = 2;
            this.field1657 = 2;
        } else {
            this.field1660 = 1;
            this.field1657 = 1;
        }
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field1656 = 0;
        this.field1657 = 0;
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field1656 = 0;
        this.field1658 = -1;
        this.field1659 = -1;
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1653 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1656 = 0;
        this.field1658 = var2;
        this.field1659 = var3;
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1653 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1656 = 0;
        this.field1658 = var2;
        this.field1659 = var3;
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field1656 = 0;
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
            this.field1668[var3] = 1;
        }
        if (var3 > 4) {
            this.field1669[this.field1671] = var3;
            this.field1671 = this.field1671 + 1 & 0x7F;
        }
        if (class53.field1329) {
        }
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field1656 = 0;
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
            this.field1668[var3] = 0;
        }
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "b", descriptor = "(I)I")
    public final int method580(int arg0) {
        int var2 = -1;
        if (arg0 < 4 || arg0 > 4) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field1671 != this.field1670) {
            var2 = this.field1669[this.field1670];
            this.field1670 = this.field1670 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field1655 = true;
        this.field1654 = true;
        this.method46(1);
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field1655 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field1668[var2] = 0;
        }
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "a", descriptor = "()V")
    public void method70() {
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "a", descriptor = "(B)V")
    public void method63(byte arg0) {
        if (arg0 != -35) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "b", descriptor = "(B)V")
    public void method96(byte arg0) {
        if (arg0 != 0) {
            this.field1641 = !this.field1641;
        }
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "c", descriptor = "(I)V")
    public void method152(int arg0) {
        int var2 = 27 / arg0;
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "d", descriptor = "(I)V")
    public void method46(int arg0) {
        if (this.field1640 != arg0) {
            this.field1640 = 117;
        }
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "e", descriptor = "(I)Ljava/awt/Component;")
    public Component method42(int arg0) {
        if (arg0 < 1 || arg0 > 1) {
            this.field1638 = !this.field1638;
        }
        return this.field1653 == null ? this : this.field1653;
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method97(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "ZAMJOSBM", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    public void method87(String arg0, int arg1, byte arg2) {
        while (this.field1650 == null) {
            this.field1650 = this.method42(1).getGraphics();
            try {
                this.method42(1).repaint();
            } catch (Exception var11) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var10) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        if (arg2 == 9) {
            boolean var5 = false;
        } else {
            this.field1640 = 18;
        }
        FontMetrics var6 = this.method42(1).getFontMetrics(var4);
        Font var7 = new Font("Helvetica", 0, 13);
        this.method42(1).getFontMetrics(var7);
        if (this.field1654) {
            this.field1650.setColor(Color.black);
            this.field1650.fillRect(0, 0, this.field1648, this.field1649);
            this.field1654 = false;
        }
        Color var8 = new Color(140, 17, 17);
        int var9 = this.field1649 / 2 - 18;
        this.field1650.setColor(var8);
        this.field1650.drawRect(this.field1648 / 2 - 152, var9, 304, 34);
        this.field1650.fillRect(this.field1648 / 2 - 150, var9 + 2, arg1 * 3, 30);
        this.field1650.setColor(Color.black);
        this.field1650.fillRect(arg1 * 3 + this.field1648 / 2 - 150, var9 + 2, 300 - arg1 * 3, 30);
        this.field1650.setFont(var4);
        this.field1650.setColor(Color.white);
        this.field1650.drawString(arg0, (this.field1648 - var6.stringWidth(arg0)) / 2, var9 + 22);
    }
}
