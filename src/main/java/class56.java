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

@OriginalClass("TFSZPSRF")
public class class56 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "TFSZPSRF", name = "a", descriptor = "I")
    private int field1541 = 9;

    @OriginalMember(owner = "TFSZPSRF", name = "b", descriptor = "I")
    private int field1542 = 300;

    @OriginalMember(owner = "TFSZPSRF", name = "c", descriptor = "Z")
    private boolean field1543 = false;

    @OriginalMember(owner = "TFSZPSRF", name = "d", descriptor = "Z")
    private boolean field1544 = true;

    @OriginalMember(owner = "TFSZPSRF", name = "g", descriptor = "I")
    private int field1547 = 20;

    @OriginalMember(owner = "TFSZPSRF", name = "h", descriptor = "I")
    public int field1548 = 1;

    @OriginalMember(owner = "TFSZPSRF", name = "i", descriptor = "[J")
    private long[] field1549 = new long[10];

    @OriginalMember(owner = "TFSZPSRF", name = "k", descriptor = "Z")
    public boolean field1551 = false;

    @OriginalMember(owner = "TFSZPSRF", name = "p", descriptor = "[LYZDAHXEQ;")
    public class70[] field1556 = new class70[6];

    @OriginalMember(owner = "TFSZPSRF", name = "r", descriptor = "Z")
    public boolean field1558 = true;

    @OriginalMember(owner = "TFSZPSRF", name = "s", descriptor = "Z")
    public boolean field1559 = true;

    @OriginalMember(owner = "TFSZPSRF", name = "F", descriptor = "[I")
    public int[] field1572 = new int[128];

    @OriginalMember(owner = "TFSZPSRF", name = "G", descriptor = "[I")
    private int[] field1573 = new int[128];

    @OriginalMember(owner = "TFSZPSRF", name = "e", descriptor = "I")
    private int field1545;

    @OriginalMember(owner = "TFSZPSRF", name = "f", descriptor = "I")
    private int field1546;

    @OriginalMember(owner = "TFSZPSRF", name = "j", descriptor = "I")
    public int field1550;

    @OriginalMember(owner = "TFSZPSRF", name = "l", descriptor = "I")
    public int field1552;

    @OriginalMember(owner = "TFSZPSRF", name = "m", descriptor = "I")
    public int field1553;

    @OriginalMember(owner = "TFSZPSRF", name = "t", descriptor = "I")
    public int field1560;

    @OriginalMember(owner = "TFSZPSRF", name = "u", descriptor = "I")
    public int field1561;

    @OriginalMember(owner = "TFSZPSRF", name = "v", descriptor = "I")
    public int field1562;

    @OriginalMember(owner = "TFSZPSRF", name = "w", descriptor = "I")
    public int field1563;

    @OriginalMember(owner = "TFSZPSRF", name = "x", descriptor = "I")
    public int field1564;

    @OriginalMember(owner = "TFSZPSRF", name = "y", descriptor = "I")
    public int field1565;

    @OriginalMember(owner = "TFSZPSRF", name = "z", descriptor = "I")
    public int field1566;

    @OriginalMember(owner = "TFSZPSRF", name = "B", descriptor = "I")
    public int field1568;

    @OriginalMember(owner = "TFSZPSRF", name = "C", descriptor = "I")
    public int field1569;

    @OriginalMember(owner = "TFSZPSRF", name = "D", descriptor = "I")
    public int field1570;

    @OriginalMember(owner = "TFSZPSRF", name = "H", descriptor = "I")
    private int field1574;

    @OriginalMember(owner = "TFSZPSRF", name = "I", descriptor = "I")
    private int field1575;

    @OriginalMember(owner = "TFSZPSRF", name = "J", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "TFSZPSRF", name = "A", descriptor = "J")
    public long field1567;

    @OriginalMember(owner = "TFSZPSRF", name = "E", descriptor = "J")
    public long field1571;

    @OriginalMember(owner = "TFSZPSRF", name = "q", descriptor = "LAPBCEOWT;")
    public class1 field1557;

    @OriginalMember(owner = "TFSZPSRF", name = "o", descriptor = "LYOIXICCU;")
    public class68 field1555;

    @OriginalMember(owner = "TFSZPSRF", name = "n", descriptor = "Ljava/awt/Graphics;")
    public Graphics field1554;

    @OriginalMember(owner = "TFSZPSRF", name = "a", descriptor = "(III)V")
    public final void method508(int arg0, int arg1, int arg2) {
        if (arg1 != 45399) {
            return;
        }
        this.field1552 = arg2;
        this.field1553 = arg0;
        this.field1557 = new class1(this, true, this.field1553, this.field1552);
        this.field1554 = this.method143(true).getGraphics();
        this.field1555 = new class68(this.field1552, (byte) -48, this.method143(true), this.field1553);
        this.method115(this, 1);
    }

    @OriginalMember(owner = "TFSZPSRF", name = "a", descriptor = "(ZII)V")
    public final void method509(boolean arg0, int arg1, int arg2) {
        this.field1552 = arg1;
        this.field1553 = arg2;
        this.field1554 = this.method143(true).getGraphics();
        this.field1555 = new class68(this.field1552, (byte) -48, this.method143(true), this.field1553);
        this.method115(this, 1);
        if (arg0) {
            this.field1543 = !this.field1543;
        }
    }

    @OriginalMember(owner = "TFSZPSRF", name = "run", descriptor = "()V")
    public void run() {
        this.method143(true).addMouseListener(this);
        this.method143(true).addMouseMotionListener(this);
        this.method143(true).addKeyListener(this);
        this.method143(true).addFocusListener(this);
        if (this.field1557 != null) {
            this.field1557.addWindowListener(this);
        }
        this.method166("Loading...", 0, -799);
        this.method146();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field1549[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field1546 < 0) {
                    if (this.field1546 == -1) {
                        this.method510(false);
                    }
                    return;
                }
                if (this.field1546 > 0) {
                    this.field1546--;
                    if (this.field1546 == 0) {
                        this.method510(false);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field1549[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field1549[var1]) {
                    var2 = (int) ((long) (this.field1547 * 2560) / (var11 - this.field1549[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field1547 - (var11 - this.field1549[var1]) / 10L);
                }
                if (var3 > this.field1547) {
                    var3 = this.field1547;
                }
                this.field1549[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field1549[var13] != 0L) {
                            this.field1549[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field1548) {
                    var3 = this.field1548;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field1568 = this.field1564;
                    this.field1569 = this.field1565;
                    this.field1570 = this.field1566;
                    this.field1571 = this.field1567;
                    this.field1564 = 0;
                    this.method108(9);
                    this.field1574 = this.field1575;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field1547 > 0) {
                    this.field1550 = var2 * 1000 / (this.field1547 * 256);
                }
                this.method119(false);
            } while (!this.field1551);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field1549[var15]);
            }
            System.out.println("fps:" + this.field1550 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field1547 + " mindel:" + this.field1548);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field1551 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "TFSZPSRF", name = "a", descriptor = "(Z)V")
    public final void method510(boolean arg0) {
        this.field1546 = -2;
        if (arg0) {
            this.field1544 = !this.field1544;
        }
        this.method121(this.field1542);
        if (this.field1557 == null) {
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

    @OriginalMember(owner = "TFSZPSRF", name = "a", descriptor = "(II)V")
    public final void method511(int arg0, int arg1) {
        this.field1547 = 1000 / arg0;
        if (arg1 != 8) {
            this.field1545 = -83;
        }
    }

    @OriginalMember(owner = "TFSZPSRF", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field1546 >= 0) {
            this.field1546 = 0;
        }
    }

    @OriginalMember(owner = "TFSZPSRF", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field1546 >= 0) {
            this.field1546 = 4000 / this.field1547;
        }
    }

    @OriginalMember(owner = "TFSZPSRF", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field1546 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field1546 == -1) {
            this.method510(false);
        }
    }

    @OriginalMember(owner = "TFSZPSRF", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field1554 == null) {
            this.field1554 = arg0;
        }
        this.field1558 = true;
        this.method48(3);
    }

    @OriginalMember(owner = "TFSZPSRF", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field1554 == null) {
            this.field1554 = arg0;
        }
        this.field1558 = true;
        this.method48(3);
    }

    @OriginalMember(owner = "TFSZPSRF", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1557 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1560 = 0;
        this.field1565 = var2;
        this.field1566 = var3;
        this.field1567 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field1564 = 2;
            this.field1561 = 2;
        } else {
            this.field1564 = 1;
            this.field1561 = 1;
        }
    }

    @OriginalMember(owner = "TFSZPSRF", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field1560 = 0;
        this.field1561 = 0;
    }

    @OriginalMember(owner = "TFSZPSRF", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "TFSZPSRF", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "TFSZPSRF", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field1560 = 0;
        this.field1562 = -1;
        this.field1563 = -1;
    }

    @OriginalMember(owner = "TFSZPSRF", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1557 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1560 = 0;
        this.field1562 = var2;
        this.field1563 = var3;
    }

    @OriginalMember(owner = "TFSZPSRF", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1557 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1560 = 0;
        this.field1562 = var2;
        this.field1563 = var3;
    }

    @OriginalMember(owner = "TFSZPSRF", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field1560 = 0;
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
            this.field1572[var3] = 1;
        }
        if (var3 > 4) {
            this.field1573[this.field1575] = var3;
            this.field1575 = this.field1575 + 1 & 0x7F;
        }
        if (class38.field1228) {
        }
    }

    @OriginalMember(owner = "TFSZPSRF", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field1560 = 0;
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
            this.field1572[var3] = 0;
        }
    }

    @OriginalMember(owner = "TFSZPSRF", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "TFSZPSRF", name = "a", descriptor = "(B)I")
    public final int method512(byte arg0) {
        if (arg0 != 38) {
            return 0;
        }
        int var2 = -1;
        if (this.field1575 != this.field1574) {
            var2 = this.field1573[this.field1574];
            this.field1574 = this.field1574 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "TFSZPSRF", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field1559 = true;
        this.field1558 = true;
        this.method48(3);
    }

    @OriginalMember(owner = "TFSZPSRF", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field1559 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field1572[var2] = 0;
        }
    }

    @OriginalMember(owner = "TFSZPSRF", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "TFSZPSRF", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "TFSZPSRF", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "TFSZPSRF", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "TFSZPSRF", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "TFSZPSRF", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "TFSZPSRF", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "TFSZPSRF", name = "a", descriptor = "()V")
    public void method146() {
    }

    @OriginalMember(owner = "TFSZPSRF", name = "a", descriptor = "(I)V")
    public void method108(int arg0) {
        if (arg0 < this.field1541 || arg0 > this.field1541) {
            this.field1541 = 126;
        }
    }

    @OriginalMember(owner = "TFSZPSRF", name = "b", descriptor = "(I)V")
    public void method121(int arg0) {
        int var2 = 52 / arg0;
    }

    @OriginalMember(owner = "TFSZPSRF", name = "b", descriptor = "(Z)V")
    public void method119(boolean arg0) {
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "TFSZPSRF", name = "c", descriptor = "(I)V")
    public void method48(int arg0) {
        if (arg0 == 3) {
            ;
        }
    }

    @OriginalMember(owner = "TFSZPSRF", name = "c", descriptor = "(Z)Ljava/awt/Component;")
    public Component method143(boolean arg0) {
        if (!arg0) {
            this.field1545 = -90;
        }
        return this.field1557 == null ? this : this.field1557;
    }

    @OriginalMember(owner = "TFSZPSRF", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method115(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "TFSZPSRF", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public void method166(String arg0, int arg1, int arg2) {
        while (this.field1554 == null) {
            this.field1554 = this.method143(true).getGraphics();
            try {
                this.method143(true).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method143(true).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method143(true).getFontMetrics(var6);
        if (this.field1558) {
            this.field1554.setColor(Color.black);
            this.field1554.fillRect(0, 0, this.field1552, this.field1553);
            this.field1558 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field1553 / 2 - 18;
        this.field1554.setColor(var7);
        this.field1554.drawRect(this.field1552 / 2 - 152, var8, 304, 34);
        this.field1554.fillRect(this.field1552 / 2 - 150, var8 + 2, arg1 * 3, 30);
        if (arg2 >= 0) {
            return;
        }
        this.field1554.setColor(Color.black);
        this.field1554.fillRect(arg1 * 3 + this.field1552 / 2 - 150, var8 + 2, 300 - arg1 * 3, 30);
        this.field1554.setFont(var4);
        this.field1554.setColor(Color.white);
        this.field1554.drawString(arg0, (this.field1552 - var5.stringWidth(arg0)) / 2, var8 + 22);
    }
}
