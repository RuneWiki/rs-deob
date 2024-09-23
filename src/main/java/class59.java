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

@OriginalClass("VZUGTFOW")
public class class59 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "VZUGTFOW", name = "a", descriptor = "Z")
    private boolean field1490 = true;

    @OriginalMember(owner = "VZUGTFOW", name = "c", descriptor = "I")
    private int field1492 = 25292;

    @OriginalMember(owner = "VZUGTFOW", name = "d", descriptor = "Z")
    private boolean field1493 = true;

    @OriginalMember(owner = "VZUGTFOW", name = "f", descriptor = "I")
    private int field1495 = 20;

    @OriginalMember(owner = "VZUGTFOW", name = "g", descriptor = "I")
    public int field1496 = 1;

    @OriginalMember(owner = "VZUGTFOW", name = "h", descriptor = "[J")
    private long[] field1497 = new long[10];

    @OriginalMember(owner = "VZUGTFOW", name = "j", descriptor = "Z")
    public boolean field1499 = false;

    @OriginalMember(owner = "VZUGTFOW", name = "o", descriptor = "[LYHASUFYG;")
    public class68[] field1504 = new class68[6];

    @OriginalMember(owner = "VZUGTFOW", name = "q", descriptor = "Z")
    public boolean field1506 = true;

    @OriginalMember(owner = "VZUGTFOW", name = "r", descriptor = "Z")
    public boolean field1507 = true;

    @OriginalMember(owner = "VZUGTFOW", name = "E", descriptor = "[I")
    public int[] field1520 = new int[128];

    @OriginalMember(owner = "VZUGTFOW", name = "F", descriptor = "[I")
    private int[] field1521 = new int[128];

    @OriginalMember(owner = "VZUGTFOW", name = "b", descriptor = "I")
    private int field1491;

    @OriginalMember(owner = "VZUGTFOW", name = "e", descriptor = "I")
    private int field1494;

    @OriginalMember(owner = "VZUGTFOW", name = "i", descriptor = "I")
    public int field1498;

    @OriginalMember(owner = "VZUGTFOW", name = "k", descriptor = "I")
    public int field1500;

    @OriginalMember(owner = "VZUGTFOW", name = "l", descriptor = "I")
    public int field1501;

    @OriginalMember(owner = "VZUGTFOW", name = "s", descriptor = "I")
    public int field1508;

    @OriginalMember(owner = "VZUGTFOW", name = "t", descriptor = "I")
    public int field1509;

    @OriginalMember(owner = "VZUGTFOW", name = "u", descriptor = "I")
    public int field1510;

    @OriginalMember(owner = "VZUGTFOW", name = "v", descriptor = "I")
    public int field1511;

    @OriginalMember(owner = "VZUGTFOW", name = "w", descriptor = "I")
    public int field1512;

    @OriginalMember(owner = "VZUGTFOW", name = "x", descriptor = "I")
    public int field1513;

    @OriginalMember(owner = "VZUGTFOW", name = "y", descriptor = "I")
    public int field1514;

    @OriginalMember(owner = "VZUGTFOW", name = "A", descriptor = "I")
    public int field1516;

    @OriginalMember(owner = "VZUGTFOW", name = "B", descriptor = "I")
    public int field1517;

    @OriginalMember(owner = "VZUGTFOW", name = "C", descriptor = "I")
    public int field1518;

    @OriginalMember(owner = "VZUGTFOW", name = "G", descriptor = "I")
    private int field1522;

    @OriginalMember(owner = "VZUGTFOW", name = "H", descriptor = "I")
    private int field1523;

    @OriginalMember(owner = "VZUGTFOW", name = "I", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "VZUGTFOW", name = "z", descriptor = "J")
    public long field1515;

    @OriginalMember(owner = "VZUGTFOW", name = "D", descriptor = "J")
    public long field1519;

    @OriginalMember(owner = "VZUGTFOW", name = "p", descriptor = "LPNNSUEUM;")
    public class39 field1505;

    @OriginalMember(owner = "VZUGTFOW", name = "n", descriptor = "LSKZHQGHX;")
    public class50 field1503;

    @OriginalMember(owner = "VZUGTFOW", name = "m", descriptor = "Ljava/awt/Graphics;")
    public Graphics field1502;

    @OriginalMember(owner = "VZUGTFOW", name = "a", descriptor = "(III)V")
    public final void method511(int arg0, int arg1, int arg2) {
        this.field1500 = arg0;
        this.field1501 = arg1;
        this.field1505 = new class39(this.field1500, this.field1501, this, true);
        this.field1502 = this.method44((byte) 2).getGraphics();
        if (arg2 < 0) {
            this.field1503 = new class50(this.field1501, 13856, this.field1500, this.method44((byte) 2));
            this.method36(this, 1);
        }
    }

    @OriginalMember(owner = "VZUGTFOW", name = "b", descriptor = "(III)V")
    public final void method512(int arg0, int arg1, int arg2) {
        this.field1500 = arg1;
        this.field1501 = arg0;
        this.field1502 = this.method44((byte) 2).getGraphics();
        if (arg2 != 9) {
            this.field1491 = -88;
        }
        this.field1503 = new class50(this.field1501, 13856, this.field1500, this.method44((byte) 2));
        this.method36(this, 1);
    }

    @OriginalMember(owner = "VZUGTFOW", name = "run", descriptor = "()V")
    public void run() {
        this.method44((byte) 2).addMouseListener(this);
        this.method44((byte) 2).addMouseMotionListener(this);
        this.method44((byte) 2).addKeyListener(this);
        this.method44((byte) 2).addFocusListener(this);
        if (this.field1505 != null) {
            this.field1505.addWindowListener(this);
        }
        this.method83(this.field1490, 0, "Loading...");
        this.method116();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field1497[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field1494 < 0) {
                    if (this.field1494 == -1) {
                        this.method513(0);
                    }
                    return;
                }
                if (this.field1494 > 0) {
                    this.field1494--;
                    if (this.field1494 == 0) {
                        this.method513(0);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field1497[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field1497[var1]) {
                    var2 = (int) ((long) (this.field1495 * 2560) / (var11 - this.field1497[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field1495 - (var11 - this.field1497[var1]) / 10L);
                }
                if (var3 > this.field1495) {
                    var3 = this.field1495;
                }
                this.field1497[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field1497[var13] != 0L) {
                            this.field1497[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field1496) {
                    var3 = this.field1496;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field1516 = this.field1512;
                    this.field1517 = this.field1513;
                    this.field1518 = this.field1514;
                    this.field1519 = this.field1515;
                    this.field1512 = 0;
                    this.method152(-601);
                    this.field1522 = this.field1523;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field1495 > 0) {
                    this.field1498 = var2 * 1000 / (this.field1495 * 256);
                }
                this.method53((byte) 112);
            } while (!this.field1499);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field1497[var15]);
            }
            System.out.println("fps:" + this.field1498 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field1495 + " mindel:" + this.field1496);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field1499 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "VZUGTFOW", name = "a", descriptor = "(I)V")
    public final void method513(int arg0) {
        this.field1494 = -2;
        if (arg0 != 0) {
            this.field1491 = -341;
        }
        this.method110(533);
        if (this.field1505 == null) {
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

    @OriginalMember(owner = "VZUGTFOW", name = "a", descriptor = "(II)V")
    public final void method514(int arg0, int arg1) {
        this.field1495 = 1000 / arg0;
        if (arg1 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "VZUGTFOW", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field1494 >= 0) {
            this.field1494 = 0;
        }
    }

    @OriginalMember(owner = "VZUGTFOW", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field1494 >= 0) {
            this.field1494 = 4000 / this.field1495;
        }
    }

    @OriginalMember(owner = "VZUGTFOW", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field1494 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field1494 == -1) {
            this.method513(0);
        }
    }

    @OriginalMember(owner = "VZUGTFOW", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field1502 == null) {
            this.field1502 = arg0;
        }
        this.field1506 = true;
        this.method96(0);
    }

    @OriginalMember(owner = "VZUGTFOW", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field1502 == null) {
            this.field1502 = arg0;
        }
        this.field1506 = true;
        this.method96(0);
    }

    @OriginalMember(owner = "VZUGTFOW", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1505 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1508 = 0;
        this.field1513 = var2;
        this.field1514 = var3;
        this.field1515 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field1512 = 2;
            this.field1509 = 2;
        } else {
            this.field1512 = 1;
            this.field1509 = 1;
        }
    }

    @OriginalMember(owner = "VZUGTFOW", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field1508 = 0;
        this.field1509 = 0;
    }

    @OriginalMember(owner = "VZUGTFOW", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "VZUGTFOW", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "VZUGTFOW", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field1508 = 0;
        this.field1510 = -1;
        this.field1511 = -1;
    }

    @OriginalMember(owner = "VZUGTFOW", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1505 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1508 = 0;
        this.field1510 = var2;
        this.field1511 = var3;
    }

    @OriginalMember(owner = "VZUGTFOW", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1505 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1508 = 0;
        this.field1510 = var2;
        this.field1511 = var3;
    }

    @OriginalMember(owner = "VZUGTFOW", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field1508 = 0;
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
            this.field1520[var3] = 1;
        }
        if (var3 > 4) {
            this.field1521[this.field1523] = var3;
            this.field1523 = this.field1523 + 1 & 0x7F;
        }
        if (class64.field1590) {
        }
    }

    @OriginalMember(owner = "VZUGTFOW", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field1508 = 0;
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
            this.field1520[var3] = 0;
        }
    }

    @OriginalMember(owner = "VZUGTFOW", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "VZUGTFOW", name = "b", descriptor = "(I)I")
    public final int method515(int arg0) {
        int var2 = -1;
        if (arg0 != 31514) {
            this.field1491 = -291;
        }
        if (this.field1523 != this.field1522) {
            var2 = this.field1521[this.field1522];
            this.field1522 = this.field1522 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "VZUGTFOW", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field1507 = true;
        this.field1506 = true;
        this.method96(0);
    }

    @OriginalMember(owner = "VZUGTFOW", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field1507 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field1520[var2] = 0;
        }
    }

    @OriginalMember(owner = "VZUGTFOW", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "VZUGTFOW", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "VZUGTFOW", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "VZUGTFOW", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "VZUGTFOW", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "VZUGTFOW", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "VZUGTFOW", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "VZUGTFOW", name = "a", descriptor = "()V")
    public void method116() {
    }

    @OriginalMember(owner = "VZUGTFOW", name = "c", descriptor = "(I)V")
    public void method152(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "VZUGTFOW", name = "d", descriptor = "(I)V")
    public void method110(int arg0) {
        int var2 = 10 / arg0;
    }

    @OriginalMember(owner = "VZUGTFOW", name = "a", descriptor = "(B)V")
    public void method53(byte arg0) {
        if (arg0 != 112) {
            this.field1493 = !this.field1493;
        }
    }

    @OriginalMember(owner = "VZUGTFOW", name = "e", descriptor = "(I)V")
    public void method96(int arg0) {
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "VZUGTFOW", name = "b", descriptor = "(B)Ljava/awt/Component;")
    public Component method44(byte arg0) {
        if (arg0 != 2) {
            this.field1492 = 218;
        }
        return this.field1505 == null ? this : this.field1505;
    }

    @OriginalMember(owner = "VZUGTFOW", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method36(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "VZUGTFOW", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public void method83(boolean arg0, int arg1, String arg2) {
        while (this.field1502 == null) {
            this.field1502 = this.method44((byte) 2).getGraphics();
            try {
                this.method44((byte) 2).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method44((byte) 2).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method44((byte) 2).getFontMetrics(var6);
        if (this.field1506) {
            this.field1502.setColor(Color.black);
            this.field1502.fillRect(0, 0, this.field1500, this.field1501);
            this.field1506 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field1501 / 2 - 18;
        this.field1502.setColor(var7);
        this.field1502.drawRect(this.field1500 / 2 - 152, var8, 304, 34);
        this.field1502.fillRect(this.field1500 / 2 - 150, var8 + 2, arg1 * 3, 30);
        this.field1502.setColor(Color.black);
        if (!arg0) {
            this.field1493 = !this.field1493;
        }
        this.field1502.fillRect(arg1 * 3 + this.field1500 / 2 - 150, var8 + 2, 300 - arg1 * 3, 30);
        this.field1502.setFont(var4);
        this.field1502.setColor(Color.white);
        this.field1502.drawString(arg2, (this.field1500 - var5.stringWidth(arg2)) / 2, var8 + 22);
    }
}
