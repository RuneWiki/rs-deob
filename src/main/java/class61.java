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

@OriginalClass("UNXTKTRJ")
public class class61 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "UNXTKTRJ", name = "a", descriptor = "Z")
    private boolean field1506 = false;

    @OriginalMember(owner = "UNXTKTRJ", name = "b", descriptor = "I")
    private int field1507 = -318;

    @OriginalMember(owner = "UNXTKTRJ", name = "c", descriptor = "Z")
    private boolean field1508 = true;

    @OriginalMember(owner = "UNXTKTRJ", name = "d", descriptor = "Z")
    private boolean field1509 = true;

    @OriginalMember(owner = "UNXTKTRJ", name = "e", descriptor = "I")
    private int field1510 = 6;

    @OriginalMember(owner = "UNXTKTRJ", name = "g", descriptor = "I")
    private int field1512 = 20;

    @OriginalMember(owner = "UNXTKTRJ", name = "h", descriptor = "I")
    public int field1513 = 1;

    @OriginalMember(owner = "UNXTKTRJ", name = "i", descriptor = "[J")
    private long[] field1514 = new long[10];

    @OriginalMember(owner = "UNXTKTRJ", name = "k", descriptor = "Z")
    public boolean field1516 = false;

    @OriginalMember(owner = "UNXTKTRJ", name = "p", descriptor = "[LYGMSKJOQ;")
    public class69[] field1521 = new class69[6];

    @OriginalMember(owner = "UNXTKTRJ", name = "r", descriptor = "Z")
    public boolean field1523 = true;

    @OriginalMember(owner = "UNXTKTRJ", name = "s", descriptor = "Z")
    public boolean field1524 = true;

    @OriginalMember(owner = "UNXTKTRJ", name = "F", descriptor = "[I")
    public int[] field1537 = new int[128];

    @OriginalMember(owner = "UNXTKTRJ", name = "G", descriptor = "[I")
    private int[] field1538 = new int[128];

    @OriginalMember(owner = "UNXTKTRJ", name = "f", descriptor = "I")
    private int field1511;

    @OriginalMember(owner = "UNXTKTRJ", name = "j", descriptor = "I")
    public int field1515;

    @OriginalMember(owner = "UNXTKTRJ", name = "l", descriptor = "I")
    public int field1517;

    @OriginalMember(owner = "UNXTKTRJ", name = "m", descriptor = "I")
    public int field1518;

    @OriginalMember(owner = "UNXTKTRJ", name = "t", descriptor = "I")
    public int field1525;

    @OriginalMember(owner = "UNXTKTRJ", name = "u", descriptor = "I")
    public int field1526;

    @OriginalMember(owner = "UNXTKTRJ", name = "v", descriptor = "I")
    public int field1527;

    @OriginalMember(owner = "UNXTKTRJ", name = "w", descriptor = "I")
    public int field1528;

    @OriginalMember(owner = "UNXTKTRJ", name = "x", descriptor = "I")
    public int field1529;

    @OriginalMember(owner = "UNXTKTRJ", name = "y", descriptor = "I")
    public int field1530;

    @OriginalMember(owner = "UNXTKTRJ", name = "z", descriptor = "I")
    public int field1531;

    @OriginalMember(owner = "UNXTKTRJ", name = "B", descriptor = "I")
    public int field1533;

    @OriginalMember(owner = "UNXTKTRJ", name = "C", descriptor = "I")
    public int field1534;

    @OriginalMember(owner = "UNXTKTRJ", name = "D", descriptor = "I")
    public int field1535;

    @OriginalMember(owner = "UNXTKTRJ", name = "H", descriptor = "I")
    private int field1539;

    @OriginalMember(owner = "UNXTKTRJ", name = "I", descriptor = "I")
    private int field1540;

    @OriginalMember(owner = "UNXTKTRJ", name = "J", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "UNXTKTRJ", name = "A", descriptor = "J")
    public long field1532;

    @OriginalMember(owner = "UNXTKTRJ", name = "E", descriptor = "J")
    public long field1536;

    @OriginalMember(owner = "UNXTKTRJ", name = "q", descriptor = "LLQFUVOUC;")
    public class31 field1522;

    @OriginalMember(owner = "UNXTKTRJ", name = "o", descriptor = "LYQSLUNUN;")
    public class71 field1520;

    @OriginalMember(owner = "UNXTKTRJ", name = "n", descriptor = "Ljava/awt/Graphics;")
    public Graphics field1519;

    @OriginalMember(owner = "UNXTKTRJ", name = "a", descriptor = "(III)V")
    public final void method481(int arg0, int arg1, int arg2) {
        this.field1517 = arg2;
        if (arg1 != 0) {
            return;
        }
        this.field1518 = arg0;
        this.field1522 = new class31((byte) 2, this.field1517, this.field1518, this);
        this.field1519 = this.method28((byte) 7).getGraphics();
        this.field1520 = new class71(this.field1518, this.method28((byte) 7), this.field1517, (byte) 1);
        this.method106(this, 1);
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "a", descriptor = "(IIB)V")
    public final void method482(int arg0, int arg1, byte arg2) {
        this.field1517 = arg1;
        this.field1518 = arg0;
        if (arg2 != -23) {
            this.field1508 = !this.field1508;
        }
        this.field1519 = this.method28((byte) 7).getGraphics();
        this.field1520 = new class71(this.field1518, this.method28((byte) 7), this.field1517, (byte) 1);
        this.method106(this, 1);
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "run", descriptor = "()V")
    public void run() {
        this.method28((byte) 7).addMouseListener(this);
        this.method28((byte) 7).addMouseMotionListener(this);
        this.method28((byte) 7).addKeyListener(this);
        this.method28((byte) 7).addFocusListener(this);
        if (this.field1522 != null) {
            this.field1522.addWindowListener(this);
        }
        this.method107(0, false, "Loading...");
        this.method46();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field1514[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field1511 < 0) {
                    if (this.field1511 == -1) {
                        this.method483((byte) 3);
                    }
                    return;
                }
                if (this.field1511 > 0) {
                    this.field1511--;
                    if (this.field1511 == 0) {
                        this.method483((byte) 3);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field1514[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field1514[var1]) {
                    var2 = (int) ((long) (this.field1512 * 2560) / (var11 - this.field1514[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field1512 - (var11 - this.field1514[var1]) / 10L);
                }
                if (var3 > this.field1512) {
                    var3 = this.field1512;
                }
                this.field1514[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field1514[var13] != 0L) {
                            this.field1514[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field1513) {
                    var3 = this.field1513;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field1533 = this.field1529;
                    this.field1534 = this.field1530;
                    this.field1535 = this.field1531;
                    this.field1536 = this.field1532;
                    this.field1529 = 0;
                    this.method73(true);
                    this.field1539 = this.field1540;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field1512 > 0) {
                    this.field1515 = var2 * 1000 / (this.field1512 * 256);
                }
                this.method102((byte) 6);
            } while (!this.field1516);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field1514[var15]);
            }
            System.out.println("fps:" + this.field1515 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field1512 + " mindel:" + this.field1513);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field1516 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "a", descriptor = "(B)V")
    public final void method483(byte arg0) {
        if (arg0 != 3) {
            return;
        }
        this.field1511 = -2;
        this.method69(-318);
        if (this.field1522 == null) {
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

    @OriginalMember(owner = "UNXTKTRJ", name = "a", descriptor = "(II)V")
    public final void method484(int arg0, int arg1) {
        this.field1512 = 1000 / arg1;
        int var3 = 20 / arg0;
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field1511 >= 0) {
            this.field1511 = 0;
        }
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field1511 >= 0) {
            this.field1511 = 4000 / this.field1512;
        }
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field1511 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field1511 == -1) {
            this.method483((byte) 3);
        }
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field1519 == null) {
            this.field1519 = arg0;
        }
        this.field1523 = true;
        this.method121(false);
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field1519 == null) {
            this.field1519 = arg0;
        }
        this.field1523 = true;
        this.method121(false);
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1522 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1525 = 0;
        this.field1530 = var2;
        this.field1531 = var3;
        this.field1532 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field1529 = 2;
            this.field1526 = 2;
        } else {
            this.field1529 = 1;
            this.field1526 = 1;
        }
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field1525 = 0;
        this.field1526 = 0;
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field1525 = 0;
        this.field1527 = -1;
        this.field1528 = -1;
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1522 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1525 = 0;
        this.field1527 = var2;
        this.field1528 = var3;
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1522 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1525 = 0;
        this.field1527 = var2;
        this.field1528 = var3;
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field1525 = 0;
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
            this.field1537[var3] = 1;
        }
        if (var3 > 4) {
            this.field1538[this.field1540] = var3;
            this.field1540 = this.field1540 + 1 & 0x7F;
        }
        if (class47.field1218) {
        }
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field1525 = 0;
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
            this.field1537[var3] = 0;
        }
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "b", descriptor = "(B)I")
    public final int method485(byte arg0) {
        if (arg0 != -122) {
            return this.field1510;
        }
        int var2 = -1;
        if (this.field1540 != this.field1539) {
            var2 = this.field1538[this.field1539];
            this.field1539 = this.field1539 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field1524 = true;
        this.field1523 = true;
        this.method121(false);
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field1524 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field1537[var2] = 0;
        }
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "a", descriptor = "()V")
    public void method46() {
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "a", descriptor = "(Z)V")
    public void method73(boolean arg0) {
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "a", descriptor = "(I)V")
    public void method69(int arg0) {
        while (arg0 >= 0) {
            this.field1509 = !this.field1509;
        }
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "c", descriptor = "(B)V")
    public void method102(byte arg0) {
        if (arg0 != 6) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "b", descriptor = "(Z)V")
    public void method121(boolean arg0) {
        if (arg0) {
            this.field1506 = !this.field1506;
        }
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "d", descriptor = "(B)Ljava/awt/Component;")
    public Component method28(byte arg0) {
        if (arg0 != 7) {
            throw new NullPointerException();
        }
        return this.field1522 == null ? this : this.field1522;
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method106(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "UNXTKTRJ", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public void method107(int arg0, boolean arg1, String arg2) {
        while (this.field1519 == null) {
            this.field1519 = this.method28((byte) 7).getGraphics();
            try {
                this.method28((byte) 7).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method28((byte) 7).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method28((byte) 7).getFontMetrics(var6);
        if (this.field1523) {
            this.field1519.setColor(Color.black);
            this.field1519.fillRect(0, 0, this.field1517, this.field1518);
            this.field1523 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field1518 / 2 - 18;
        this.field1519.setColor(var7);
        this.field1519.drawRect(this.field1517 / 2 - 152, var8, 304, 34);
        this.field1519.fillRect(this.field1517 / 2 - 150, var8 + 2, arg0 * 3, 30);
        this.field1519.setColor(Color.black);
        this.field1519.fillRect(arg0 * 3 + this.field1517 / 2 - 150, var8 + 2, 300 - arg0 * 3, 30);
        this.field1519.setFont(var4);
        this.field1519.setColor(Color.white);
        this.field1519.drawString(arg2, (this.field1517 - var5.stringWidth(arg2)) / 2, var8 + 22);
        if (!arg1) {
            ;
        }
    }
}
