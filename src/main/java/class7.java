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

@OriginalClass("DKKOWNCZ")
public class class7 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "DKKOWNCZ", name = "a", descriptor = "Z")
    private boolean field566 = true;

    @OriginalMember(owner = "DKKOWNCZ", name = "b", descriptor = "B")
    private byte field567 = 92;

    @OriginalMember(owner = "DKKOWNCZ", name = "c", descriptor = "Z")
    private boolean field568 = false;

    @OriginalMember(owner = "DKKOWNCZ", name = "d", descriptor = "I")
    private int field569 = 17029;

    @OriginalMember(owner = "DKKOWNCZ", name = "f", descriptor = "I")
    private int field571 = 20;

    @OriginalMember(owner = "DKKOWNCZ", name = "g", descriptor = "I")
    public int field572 = 1;

    @OriginalMember(owner = "DKKOWNCZ", name = "h", descriptor = "[J")
    private long[] field573 = new long[10];

    @OriginalMember(owner = "DKKOWNCZ", name = "j", descriptor = "Z")
    public boolean field575 = false;

    @OriginalMember(owner = "DKKOWNCZ", name = "o", descriptor = "[LEYTQJNEM;")
    public class12[] field580 = new class12[6];

    @OriginalMember(owner = "DKKOWNCZ", name = "q", descriptor = "Z")
    public boolean field582 = true;

    @OriginalMember(owner = "DKKOWNCZ", name = "r", descriptor = "Z")
    public boolean field583 = true;

    @OriginalMember(owner = "DKKOWNCZ", name = "E", descriptor = "[I")
    public int[] field596 = new int[128];

    @OriginalMember(owner = "DKKOWNCZ", name = "F", descriptor = "[I")
    private int[] field597 = new int[128];

    @OriginalMember(owner = "DKKOWNCZ", name = "e", descriptor = "I")
    private int field570;

    @OriginalMember(owner = "DKKOWNCZ", name = "i", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "DKKOWNCZ", name = "k", descriptor = "I")
    public int field576;

    @OriginalMember(owner = "DKKOWNCZ", name = "l", descriptor = "I")
    public int field577;

    @OriginalMember(owner = "DKKOWNCZ", name = "s", descriptor = "I")
    public int field584;

    @OriginalMember(owner = "DKKOWNCZ", name = "t", descriptor = "I")
    public int field585;

    @OriginalMember(owner = "DKKOWNCZ", name = "u", descriptor = "I")
    public int field586;

    @OriginalMember(owner = "DKKOWNCZ", name = "v", descriptor = "I")
    public int field587;

    @OriginalMember(owner = "DKKOWNCZ", name = "w", descriptor = "I")
    public int field588;

    @OriginalMember(owner = "DKKOWNCZ", name = "x", descriptor = "I")
    public int field589;

    @OriginalMember(owner = "DKKOWNCZ", name = "y", descriptor = "I")
    public int field590;

    @OriginalMember(owner = "DKKOWNCZ", name = "A", descriptor = "I")
    public int field592;

    @OriginalMember(owner = "DKKOWNCZ", name = "B", descriptor = "I")
    public int field593;

    @OriginalMember(owner = "DKKOWNCZ", name = "C", descriptor = "I")
    public int field594;

    @OriginalMember(owner = "DKKOWNCZ", name = "G", descriptor = "I")
    private int field598;

    @OriginalMember(owner = "DKKOWNCZ", name = "H", descriptor = "I")
    private int field599;

    @OriginalMember(owner = "DKKOWNCZ", name = "I", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "DKKOWNCZ", name = "z", descriptor = "J")
    public long field591;

    @OriginalMember(owner = "DKKOWNCZ", name = "D", descriptor = "J")
    public long field595;

    @OriginalMember(owner = "DKKOWNCZ", name = "n", descriptor = "LARAKDHLD;")
    public class2 field579;

    @OriginalMember(owner = "DKKOWNCZ", name = "p", descriptor = "LRFAAYJYN;")
    public class49 field581;

    @OriginalMember(owner = "DKKOWNCZ", name = "m", descriptor = "Ljava/awt/Graphics;")
    public Graphics field578;

    @OriginalMember(owner = "DKKOWNCZ", name = "a", descriptor = "(ZII)V")
    public final void method179(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.field568 = !this.field568;
        }
        this.field576 = arg2;
        this.field577 = arg1;
        this.field581 = new class49(-835, this.field576, this.field577, this);
        this.field578 = this.method135(8).getGraphics();
        this.field579 = new class2(this.field577, this.method135(8), 2, this.field576);
        this.method101(this, 1);
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "a", descriptor = "(III)V")
    public final void method180(int arg0, int arg1, int arg2) {
        this.field576 = arg0;
        this.field577 = arg2;
        this.field578 = this.method135(8).getGraphics();
        if (arg1 < 0) {
            this.field579 = new class2(this.field577, this.method135(8), 2, this.field576);
            this.method101(this, 1);
        }
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "run", descriptor = "()V")
    public void run() {
        this.method135(8).addMouseListener(this);
        this.method135(8).addMouseMotionListener(this);
        this.method135(8).addKeyListener(this);
        this.method135(8).addFocusListener(this);
        if (this.field581 != null) {
            this.field581.addWindowListener(this);
        }
        this.method79(3, "Loading...", 0);
        this.method62();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field573[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field570 < 0) {
                    if (this.field570 == -1) {
                        this.method181(this.field567);
                    }
                    return;
                }
                if (this.field570 > 0) {
                    this.field570--;
                    if (this.field570 == 0) {
                        this.method181(this.field567);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field573[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field573[var1]) {
                    var2 = (int) ((long) (this.field571 * 2560) / (var11 - this.field573[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field571 - (var11 - this.field573[var1]) / 10L);
                }
                if (var3 > this.field571) {
                    var3 = this.field571;
                }
                this.field573[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field573[var13] != 0L) {
                            this.field573[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field572) {
                    var3 = this.field572;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field592 = this.field588;
                    this.field593 = this.field589;
                    this.field594 = this.field590;
                    this.field595 = this.field591;
                    this.field588 = 0;
                    this.method126((byte) -44);
                    this.field598 = this.field599;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field571 > 0) {
                    this.field574 = var2 * 1000 / (this.field571 * 256);
                }
                this.method123(true);
            } while (!this.field575);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field573[var15]);
            }
            System.out.println("fps:" + this.field574 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field571 + " mindel:" + this.field572);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field575 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "a", descriptor = "(B)V")
    public final void method181(byte arg0) {
        this.field570 = -2;
        this.method31((byte) -111);
        if (arg0 != 92 || this.field581 == null) {
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

    @OriginalMember(owner = "DKKOWNCZ", name = "a", descriptor = "(II)V")
    public final void method182(int arg0, int arg1) {
        this.field571 = 1000 / arg1;
        if (arg0 >= 0) {
            this.field569 = -448;
        }
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field570 >= 0) {
            this.field570 = 0;
        }
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field570 >= 0) {
            this.field570 = 4000 / this.field571;
        }
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field570 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field570 == -1) {
            this.method181(this.field567);
        }
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field578 == null) {
            this.field578 = arg0;
        }
        this.field582 = true;
        this.method141(true);
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field578 == null) {
            this.field578 = arg0;
        }
        this.field582 = true;
        this.method141(true);
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field581 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field584 = 0;
        this.field589 = var2;
        this.field590 = var3;
        this.field591 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field588 = 2;
            this.field585 = 2;
        } else {
            this.field588 = 1;
            this.field585 = 1;
        }
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field584 = 0;
        this.field585 = 0;
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field584 = 0;
        this.field586 = -1;
        this.field587 = -1;
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field581 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field584 = 0;
        this.field586 = var2;
        this.field587 = var3;
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field581 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field584 = 0;
        this.field586 = var2;
        this.field587 = var3;
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field584 = 0;
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
            this.field596[var3] = 1;
        }
        if (var3 > 4) {
            this.field597[this.field599] = var3;
            this.field599 = this.field599 + 1 & 0x7F;
        }
        if (class37.field1083) {
        }
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field584 = 0;
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
            this.field596[var3] = 0;
        }
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "a", descriptor = "(I)I")
    public final int method183(int arg0) {
        if (arg0 != 0) {
            this.field566 = !this.field566;
        }
        int var2 = -1;
        if (this.field599 != this.field598) {
            var2 = this.field597[this.field598];
            this.field598 = this.field598 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field583 = true;
        this.field582 = true;
        this.method141(true);
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field583 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field596[var2] = 0;
        }
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "a", descriptor = "()V")
    public void method62() {
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "b", descriptor = "(B)V")
    public void method126(byte arg0) {
        if (arg0 == -44) {
            ;
        }
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "c", descriptor = "(B)V")
    public void method31(byte arg0) {
        if (arg0 != -111) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "a", descriptor = "(Z)V")
    public void method123(boolean arg0) {
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "b", descriptor = "(Z)V")
    public void method141(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "b", descriptor = "(I)Ljava/awt/Component;")
    public Component method135(int arg0) {
        if (arg0 != 8) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return this.field581 == null ? this : this.field581;
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method101(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "DKKOWNCZ", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public void method79(int arg0, String arg1, int arg2) {
        while (this.field578 == null) {
            this.field578 = this.method135(8).getGraphics();
            try {
                this.method135(8).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method135(8).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method135(8).getFontMetrics(var6);
        if (this.field582) {
            this.field578.setColor(Color.black);
            this.field578.fillRect(0, 0, this.field576, this.field577);
            this.field582 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field577 / 2 - 18;
        this.field578.setColor(var7);
        this.field578.drawRect(this.field576 / 2 - 152, var8, 304, 34);
        this.field578.fillRect(this.field576 / 2 - 150, var8 + 2, arg2 * 3, 30);
        this.field578.setColor(Color.black);
        this.field578.fillRect(arg2 * 3 + this.field576 / 2 - 150, var8 + 2, 300 - arg2 * 3, 30);
        if (arg0 == 3) {
            this.field578.setFont(var4);
            this.field578.setColor(Color.white);
            this.field578.drawString(arg1, (this.field576 - var5.stringWidth(arg1)) / 2, var8 + 22);
        }
    }
}
