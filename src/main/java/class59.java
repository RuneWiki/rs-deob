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

@OriginalClass("client!VTYHSWDE")
public class class59 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "client!VTYHSWDE", name = "a", descriptor = "I")
    private int field1553 = -985;

    @OriginalMember(owner = "client!VTYHSWDE", name = "b", descriptor = "Z")
    private boolean field1554 = false;

    @OriginalMember(owner = "client!VTYHSWDE", name = "c", descriptor = "I")
    private int field1555 = -35754;

    @OriginalMember(owner = "client!VTYHSWDE", name = "d", descriptor = "Z")
    private boolean field1556 = true;

    @OriginalMember(owner = "client!VTYHSWDE", name = "f", descriptor = "I")
    private int field1558 = 20;

    @OriginalMember(owner = "client!VTYHSWDE", name = "g", descriptor = "I")
    public int field1559 = 1;

    @OriginalMember(owner = "client!VTYHSWDE", name = "h", descriptor = "[J")
    private long[] field1560 = new long[10];

    @OriginalMember(owner = "client!VTYHSWDE", name = "j", descriptor = "Z")
    public boolean field1562 = false;

    @OriginalMember(owner = "client!VTYHSWDE", name = "o", descriptor = "[LOMAKLDKI;")
    public class37[] field1567 = new class37[6];

    @OriginalMember(owner = "client!VTYHSWDE", name = "q", descriptor = "Z")
    public boolean field1569 = true;

    @OriginalMember(owner = "client!VTYHSWDE", name = "r", descriptor = "Z")
    public boolean field1570 = true;

    @OriginalMember(owner = "client!VTYHSWDE", name = "E", descriptor = "[I")
    public int[] field1583 = new int[128];

    @OriginalMember(owner = "client!VTYHSWDE", name = "F", descriptor = "[I")
    private int[] field1584 = new int[128];

    @OriginalMember(owner = "client!VTYHSWDE", name = "e", descriptor = "I")
    private int field1557;

    @OriginalMember(owner = "client!VTYHSWDE", name = "i", descriptor = "I")
    public int field1561;

    @OriginalMember(owner = "client!VTYHSWDE", name = "k", descriptor = "I")
    public int field1563;

    @OriginalMember(owner = "client!VTYHSWDE", name = "l", descriptor = "I")
    public int field1564;

    @OriginalMember(owner = "client!VTYHSWDE", name = "s", descriptor = "I")
    public int field1571;

    @OriginalMember(owner = "client!VTYHSWDE", name = "t", descriptor = "I")
    public int field1572;

    @OriginalMember(owner = "client!VTYHSWDE", name = "u", descriptor = "I")
    public int field1573;

    @OriginalMember(owner = "client!VTYHSWDE", name = "v", descriptor = "I")
    public int field1574;

    @OriginalMember(owner = "client!VTYHSWDE", name = "w", descriptor = "I")
    public int field1575;

    @OriginalMember(owner = "client!VTYHSWDE", name = "x", descriptor = "I")
    public int field1576;

    @OriginalMember(owner = "client!VTYHSWDE", name = "y", descriptor = "I")
    public int field1577;

    @OriginalMember(owner = "client!VTYHSWDE", name = "A", descriptor = "I")
    public int field1579;

    @OriginalMember(owner = "client!VTYHSWDE", name = "B", descriptor = "I")
    public int field1580;

    @OriginalMember(owner = "client!VTYHSWDE", name = "C", descriptor = "I")
    public int field1581;

    @OriginalMember(owner = "client!VTYHSWDE", name = "G", descriptor = "I")
    private int field1585;

    @OriginalMember(owner = "client!VTYHSWDE", name = "H", descriptor = "I")
    private int field1586;

    @OriginalMember(owner = "client!VTYHSWDE", name = "I", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!VTYHSWDE", name = "z", descriptor = "J")
    public long field1578;

    @OriginalMember(owner = "client!VTYHSWDE", name = "D", descriptor = "J")
    public long field1582;

    @OriginalMember(owner = "client!VTYHSWDE", name = "n", descriptor = "LKJGJRATW;")
    public class25 field1566;

    @OriginalMember(owner = "client!VTYHSWDE", name = "p", descriptor = "LWSQCMTWN;")
    public class65 field1568;

    @OriginalMember(owner = "client!VTYHSWDE", name = "m", descriptor = "Ljava/awt/Graphics;")
    public Graphics field1565;

    @OriginalMember(owner = "client!VTYHSWDE", name = "a", descriptor = "(III)V")
    public final void method553(int arg0, int arg1, int arg2) {
        this.field1563 = arg0;
        this.field1564 = arg2;
        if (arg1 < 0 || arg1 > 0) {
            this.field1556 = !this.field1556;
        }
        this.field1568 = new class65((byte) 39, this.field1564, this, this.field1563);
        this.field1565 = this.method82(523).getGraphics();
        this.field1566 = new class25(this.method82(523), 0, this.field1563, this.field1564);
        this.method87(this, 1);
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "b", descriptor = "(III)V")
    public final void method554(int arg0, int arg1, int arg2) {
        this.field1563 = arg0;
        this.field1564 = arg1;
        if (arg2 != 0) {
            this.field1555 = 286;
        }
        this.field1565 = this.method82(523).getGraphics();
        this.field1566 = new class25(this.method82(523), 0, this.field1563, this.field1564);
        this.method87(this, 1);
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "run", descriptor = "()V")
    public void run() {
        this.method82(523).addMouseListener(this);
        this.method82(523).addMouseMotionListener(this);
        this.method82(523).addKeyListener(this);
        this.method82(523).addFocusListener(this);
        if (this.field1568 != null) {
            this.field1568.addWindowListener(this);
        }
        this.method141(true, 0, "Loading...");
        this.method155();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field1560[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field1557 < 0) {
                    if (this.field1557 == -1) {
                        this.method555((byte) -66);
                    }
                    return;
                }
                if (this.field1557 > 0) {
                    this.field1557--;
                    if (this.field1557 == 0) {
                        this.method555((byte) -66);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field1560[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field1560[var1]) {
                    var2 = (int) ((long) (this.field1558 * 2560) / (var11 - this.field1560[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field1558 - (var11 - this.field1560[var1]) / 10L);
                }
                if (var3 > this.field1558) {
                    var3 = this.field1558;
                }
                this.field1560[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field1560[var13] != 0L) {
                            this.field1560[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field1559) {
                    var3 = this.field1559;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field1579 = this.field1575;
                    this.field1580 = this.field1576;
                    this.field1581 = this.field1577;
                    this.field1582 = this.field1578;
                    this.field1575 = 0;
                    this.method79(false);
                    this.field1585 = this.field1586;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field1558 > 0) {
                    this.field1561 = var2 * 1000 / (this.field1558 * 256);
                }
                this.method77(false);
            } while (!this.field1562);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field1560[var15]);
            }
            System.out.println("fps:" + this.field1561 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field1558 + " mindel:" + this.field1559);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field1562 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "a", descriptor = "(B)V")
    public final void method555(byte arg0) {
        this.field1557 = -2;
        if (arg0 != -66) {
            return;
        }
        this.method112((byte) 8);
        if (this.field1568 == null) {
            return;
        }
        try {
            Thread.sleep(1000L);
        } catch (Exception var3) {
        }
        try {
            System.exit(0);
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "a", descriptor = "(II)V")
    public final void method556(int arg0, int arg1) {
        if (arg1 == 45200) {
            this.field1558 = 1000 / arg0;
        }
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field1557 >= 0) {
            this.field1557 = 0;
        }
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field1557 >= 0) {
            this.field1557 = 4000 / this.field1558;
        }
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field1557 = -1;
        try {
            Thread.sleep(10000L);
        } catch (Exception var1) {
        }
        if (this.field1557 == -1) {
            this.method555((byte) -66);
        }
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field1565 == null) {
            this.field1565 = arg0;
        }
        this.field1569 = true;
        this.method145(6);
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field1565 == null) {
            this.field1565 = arg0;
        }
        this.field1569 = true;
        this.method145(6);
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1568 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1571 = 0;
        this.field1576 = var2;
        this.field1577 = var3;
        this.field1578 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field1575 = 2;
            this.field1572 = 2;
        } else {
            this.field1575 = 1;
            this.field1572 = 1;
        }
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field1571 = 0;
        this.field1572 = 0;
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field1571 = 0;
        this.field1573 = -1;
        this.field1574 = -1;
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1568 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1571 = 0;
        this.field1573 = var2;
        this.field1574 = var3;
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1568 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1571 = 0;
        this.field1573 = var2;
        this.field1574 = var3;
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field1571 = 0;
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
            this.field1583[var3] = 1;
        }
        if (var3 > 4) {
            this.field1584[this.field1586] = var3;
            this.field1586 = this.field1586 + 1 & 0x7F;
        }
        if (class31.field984) {
        }
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field1571 = 0;
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
            this.field1583[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "a", descriptor = "(I)I")
    public final int method557(int arg0) {
        if (arg0 < 0 || arg0 > 0) {
            this.field1553 = -259;
        }
        int var2 = -1;
        if (this.field1586 != this.field1585) {
            var2 = this.field1584[this.field1585];
            this.field1585 = this.field1585 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field1570 = true;
        this.field1569 = true;
        this.method145(6);
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field1570 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field1583[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "a", descriptor = "()V")
    public void method155() {
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "a", descriptor = "(Z)V")
    public void method79(boolean arg0) {
        if (arg0) {
            this.field1556 = !this.field1556;
        }
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "b", descriptor = "(B)V")
    public void method112(byte arg0) {
        if (arg0 != 8) {
            this.field1553 = 167;
        }
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "b", descriptor = "(Z)V")
    public void method77(boolean arg0) {
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "b", descriptor = "(I)V")
    public void method145(int arg0) {
        if (arg0 != 6) {
            this.field1556 = !this.field1556;
        }
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "c", descriptor = "(I)Ljava/awt/Component;")
    public Component method82(int arg0) {
        if (arg0 <= 0) {
            this.field1553 = 48;
        }
        return this.field1568 == null ? this : this.field1568;
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method87(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "client!VTYHSWDE", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public void method141(boolean arg0, int arg1, String arg2) {
        while (this.field1565 == null) {
            this.field1565 = this.method82(523).getGraphics();
            try {
                this.method82(523).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method82(523).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method82(523).getFontMetrics(var6);
        if (!arg0) {
            this.field1554 = !this.field1554;
        }
        if (this.field1569) {
            this.field1565.setColor(Color.black);
            this.field1565.fillRect(0, 0, this.field1563, this.field1564);
            this.field1569 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field1564 / 2 - 18;
        this.field1565.setColor(var7);
        this.field1565.drawRect(this.field1563 / 2 - 152, var8, 304, 34);
        this.field1565.fillRect(this.field1563 / 2 - 150, var8 + 2, arg1 * 3, 30);
        this.field1565.setColor(Color.black);
        this.field1565.fillRect(arg1 * 3 + this.field1563 / 2 - 150, var8 + 2, 300 - arg1 * 3, 30);
        this.field1565.setFont(var4);
        this.field1565.setColor(Color.white);
        this.field1565.drawString(arg2, (this.field1563 - var5.stringWidth(arg2)) / 2, var8 + 22);
    }
}
