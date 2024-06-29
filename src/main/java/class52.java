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

@OriginalClass("client!SXKUAOFD")
public class class52 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "client!SXKUAOFD", name = "a", descriptor = "Z")
    private boolean field1420 = false;

    @OriginalMember(owner = "client!SXKUAOFD", name = "c", descriptor = "I")
    private int field1422 = -347;

    @OriginalMember(owner = "client!SXKUAOFD", name = "e", descriptor = "Z")
    private boolean field1424 = false;

    @OriginalMember(owner = "client!SXKUAOFD", name = "g", descriptor = "I")
    private int field1426 = 20;

    @OriginalMember(owner = "client!SXKUAOFD", name = "h", descriptor = "I")
    public int field1427 = 1;

    @OriginalMember(owner = "client!SXKUAOFD", name = "i", descriptor = "[J")
    private long[] field1428 = new long[10];

    @OriginalMember(owner = "client!SXKUAOFD", name = "k", descriptor = "Z")
    public boolean field1430 = false;

    @OriginalMember(owner = "client!SXKUAOFD", name = "p", descriptor = "[LNDGQUJMA;")
    public class36[] field1435 = new class36[6];

    @OriginalMember(owner = "client!SXKUAOFD", name = "r", descriptor = "Z")
    public boolean field1437 = true;

    @OriginalMember(owner = "client!SXKUAOFD", name = "s", descriptor = "Z")
    public boolean field1438 = true;

    @OriginalMember(owner = "client!SXKUAOFD", name = "F", descriptor = "[I")
    public int[] field1451 = new int[128];

    @OriginalMember(owner = "client!SXKUAOFD", name = "G", descriptor = "[I")
    private int[] field1452 = new int[128];

    @OriginalMember(owner = "client!SXKUAOFD", name = "b", descriptor = "I")
    private int field1421;

    @OriginalMember(owner = "client!SXKUAOFD", name = "d", descriptor = "I")
    private int field1423;

    @OriginalMember(owner = "client!SXKUAOFD", name = "f", descriptor = "I")
    private int field1425;

    @OriginalMember(owner = "client!SXKUAOFD", name = "j", descriptor = "I")
    public int field1429;

    @OriginalMember(owner = "client!SXKUAOFD", name = "l", descriptor = "I")
    public int field1431;

    @OriginalMember(owner = "client!SXKUAOFD", name = "m", descriptor = "I")
    public int field1432;

    @OriginalMember(owner = "client!SXKUAOFD", name = "t", descriptor = "I")
    public int field1439;

    @OriginalMember(owner = "client!SXKUAOFD", name = "u", descriptor = "I")
    public int field1440;

    @OriginalMember(owner = "client!SXKUAOFD", name = "v", descriptor = "I")
    public int field1441;

    @OriginalMember(owner = "client!SXKUAOFD", name = "w", descriptor = "I")
    public int field1442;

    @OriginalMember(owner = "client!SXKUAOFD", name = "x", descriptor = "I")
    public int field1443;

    @OriginalMember(owner = "client!SXKUAOFD", name = "y", descriptor = "I")
    public int field1444;

    @OriginalMember(owner = "client!SXKUAOFD", name = "z", descriptor = "I")
    public int field1445;

    @OriginalMember(owner = "client!SXKUAOFD", name = "B", descriptor = "I")
    public int field1447;

    @OriginalMember(owner = "client!SXKUAOFD", name = "C", descriptor = "I")
    public int field1448;

    @OriginalMember(owner = "client!SXKUAOFD", name = "D", descriptor = "I")
    public int field1449;

    @OriginalMember(owner = "client!SXKUAOFD", name = "H", descriptor = "I")
    private int field1453;

    @OriginalMember(owner = "client!SXKUAOFD", name = "I", descriptor = "I")
    private int field1454;

    @OriginalMember(owner = "client!SXKUAOFD", name = "J", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!SXKUAOFD", name = "A", descriptor = "J")
    public long field1446;

    @OriginalMember(owner = "client!SXKUAOFD", name = "E", descriptor = "J")
    public long field1450;

    @OriginalMember(owner = "client!SXKUAOFD", name = "q", descriptor = "LSZXWXMTH;")
    public class53 field1436;

    @OriginalMember(owner = "client!SXKUAOFD", name = "o", descriptor = "LZTWZAULT;")
    public class71 field1434;

    @OriginalMember(owner = "client!SXKUAOFD", name = "n", descriptor = "Ljava/awt/Graphics;")
    public Graphics field1433;

    @OriginalMember(owner = "client!SXKUAOFD", name = "a", descriptor = "(III)V")
    public final void method514(int arg0, int arg1, int arg2) {
        this.field1431 = arg0;
        this.field1432 = arg1;
        this.field1436 = new class53(this.field1432, 0, this.field1431, this);
        this.field1433 = this.method271(-319).getGraphics();
        if (arg2 <= 0) {
            this.field1420 = !this.field1420;
        }
        this.field1434 = new class71(this.field1423, this.method271(-319), this.field1431, this.field1432);
        this.method180(this, 1);
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "b", descriptor = "(III)V")
    public final void method515(int arg0, int arg1, int arg2) {
        this.field1431 = arg1;
        this.field1432 = arg2;
        if (arg0 == 0) {
            this.field1433 = this.method271(-319).getGraphics();
            this.field1434 = new class71(this.field1423, this.method271(-319), this.field1431, this.field1432);
            this.method180(this, 1);
        }
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "run", descriptor = "()V")
    public void run() {
        this.method271(-319).addMouseListener(this);
        this.method271(-319).addMouseMotionListener(this);
        this.method271(-319).addKeyListener(this);
        this.method271(-319).addFocusListener(this);
        if (this.field1436 != null) {
            this.field1436.addWindowListener(this);
        }
        this.method169("Loading...", 0, (byte) 108);
        this.method162();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field1428[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field1425 < 0) {
                    if (this.field1425 == -1) {
                        this.method516(-95);
                    }
                    return;
                }
                if (this.field1425 > 0) {
                    this.field1425--;
                    if (this.field1425 == 0) {
                        this.method516(-95);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field1428[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field1428[var1]) {
                    var2 = (int) ((long) (this.field1426 * 2560) / (var11 - this.field1428[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field1426 - (var11 - this.field1428[var1]) / 10L);
                }
                if (var3 > this.field1426) {
                    var3 = this.field1426;
                }
                this.field1428[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field1428[var13] != 0L) {
                            this.field1428[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field1427) {
                    var3 = this.field1427;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field1447 = this.field1443;
                    this.field1448 = this.field1444;
                    this.field1449 = this.field1445;
                    this.field1450 = this.field1446;
                    this.field1443 = 0;
                    this.method279(false);
                    this.field1453 = this.field1454;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field1426 > 0) {
                    this.field1429 = var2 * 1000 / (this.field1426 * 256);
                }
                this.method276(6);
            } while (!this.field1430);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field1428[var15]);
            }
            System.out.println("fps:" + this.field1429 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field1426 + " mindel:" + this.field1427);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field1430 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "a", descriptor = "(I)V")
    public final void method516(int arg0) {
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1425 = -2;
        this.method216(false);
        if (this.field1436 == null) {
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

    @OriginalMember(owner = "client!SXKUAOFD", name = "a", descriptor = "(ZI)V")
    public final void method517(boolean arg0, int arg1) {
        this.field1426 = 1000 / arg1;
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field1425 >= 0) {
            this.field1425 = 0;
        }
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field1425 >= 0) {
            this.field1425 = 4000 / this.field1426;
        }
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field1425 = -1;
        try {
            Thread.sleep(10000L);
        } catch (Exception var1) {
        }
        if (this.field1425 == -1) {
            this.method516(-95);
        }
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field1433 == null) {
            this.field1433 = arg0;
        }
        this.field1437 = true;
        this.method261(7831);
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field1433 == null) {
            this.field1433 = arg0;
        }
        this.field1437 = true;
        this.method261(7831);
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1436 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1439 = 0;
        this.field1444 = var2;
        this.field1445 = var3;
        this.field1446 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field1443 = 2;
            this.field1440 = 2;
        } else {
            this.field1443 = 1;
            this.field1440 = 1;
        }
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field1439 = 0;
        this.field1440 = 0;
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field1439 = 0;
        this.field1441 = -1;
        this.field1442 = -1;
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1436 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1439 = 0;
        this.field1441 = var2;
        this.field1442 = var3;
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1436 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1439 = 0;
        this.field1441 = var2;
        this.field1442 = var3;
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field1439 = 0;
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
            this.field1451[var3] = 1;
        }
        if (var3 > 4) {
            this.field1452[this.field1454] = var3;
            this.field1454 = this.field1454 + 1 & 0x7F;
        }
        if (class30.field1023) {
        }
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field1439 = 0;
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
            this.field1451[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "a", descriptor = "(Z)I")
    public final int method518(boolean arg0) {
        int var2 = -1;
        if (!arg0) {
            this.field1423 = 372;
        }
        if (this.field1454 != this.field1453) {
            var2 = this.field1452[this.field1453];
            this.field1453 = this.field1453 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field1438 = true;
        this.field1437 = true;
        this.method261(7831);
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field1438 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field1451[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "a", descriptor = "()V")
    public void method162() {
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "b", descriptor = "(Z)V")
    public void method279(boolean arg0) {
        if (arg0) {
            this.field1422 = 151;
        }
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "c", descriptor = "(Z)V")
    public void method216(boolean arg0) {
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "b", descriptor = "(I)V")
    public void method276(int arg0) {
        if (arg0 != 6) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "c", descriptor = "(I)V")
    public void method261(int arg0) {
        if (arg0 != 7831) {
            this.field1421 = 442;
        }
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "d", descriptor = "(I)Ljava/awt/Component;")
    public Component method271(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return this.field1436 == null ? this : this.field1436;
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method180(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "client!SXKUAOFD", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    public void method169(String arg0, int arg1, byte arg2) {
        while (this.field1433 == null) {
            this.field1433 = this.method271(-319).getGraphics();
            try {
                this.method271(-319).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method271(-319).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method271(-319).getFontMetrics(var6);
        if (arg2 != 108) {
            this.field1421 = -37;
        }
        if (this.field1437) {
            this.field1433.setColor(Color.black);
            this.field1433.fillRect(0, 0, this.field1431, this.field1432);
            this.field1437 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field1432 / 2 - 18;
        this.field1433.setColor(var7);
        this.field1433.drawRect(this.field1431 / 2 - 152, var8, 304, 34);
        this.field1433.fillRect(this.field1431 / 2 - 150, var8 + 2, arg1 * 3, 30);
        this.field1433.setColor(Color.black);
        this.field1433.fillRect(arg1 * 3 + this.field1431 / 2 - 150, var8 + 2, 300 - arg1 * 3, 30);
        this.field1433.setFont(var4);
        this.field1433.setColor(Color.white);
        this.field1433.drawString(arg0, (this.field1431 - var5.stringWidth(arg0)) / 2, var8 + 22);
    }
}
