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

@OriginalClass("client!EOQQYERM")
public class class10 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "client!EOQQYERM", name = "b", descriptor = "Z")
    private boolean field575 = false;

    @OriginalMember(owner = "client!EOQQYERM", name = "d", descriptor = "B")
    private byte field577 = 0;

    @OriginalMember(owner = "client!EOQQYERM", name = "e", descriptor = "I")
    private int field578 = -3404;

    @OriginalMember(owner = "client!EOQQYERM", name = "f", descriptor = "I")
    private int field579 = -3404;

    @OriginalMember(owner = "client!EOQQYERM", name = "g", descriptor = "Z")
    private boolean field580 = true;

    @OriginalMember(owner = "client!EOQQYERM", name = "i", descriptor = "I")
    private int field582 = 20;

    @OriginalMember(owner = "client!EOQQYERM", name = "j", descriptor = "I")
    public int field583 = 1;

    @OriginalMember(owner = "client!EOQQYERM", name = "k", descriptor = "[J")
    private long[] field584 = new long[10];

    @OriginalMember(owner = "client!EOQQYERM", name = "m", descriptor = "Z")
    public boolean field586 = false;

    @OriginalMember(owner = "client!EOQQYERM", name = "r", descriptor = "[LKUDWIDHU;")
    public class27[] field591 = new class27[6];

    @OriginalMember(owner = "client!EOQQYERM", name = "t", descriptor = "Z")
    public boolean field593 = true;

    @OriginalMember(owner = "client!EOQQYERM", name = "u", descriptor = "Z")
    public boolean field594 = true;

    @OriginalMember(owner = "client!EOQQYERM", name = "H", descriptor = "[I")
    public int[] field607 = new int[128];

    @OriginalMember(owner = "client!EOQQYERM", name = "I", descriptor = "[I")
    private int[] field608 = new int[128];

    @OriginalMember(owner = "client!EOQQYERM", name = "a", descriptor = "I")
    private int field574;

    @OriginalMember(owner = "client!EOQQYERM", name = "c", descriptor = "I")
    private int field576;

    @OriginalMember(owner = "client!EOQQYERM", name = "h", descriptor = "I")
    private int field581;

    @OriginalMember(owner = "client!EOQQYERM", name = "l", descriptor = "I")
    public int field585;

    @OriginalMember(owner = "client!EOQQYERM", name = "n", descriptor = "I")
    public int field587;

    @OriginalMember(owner = "client!EOQQYERM", name = "o", descriptor = "I")
    public int field588;

    @OriginalMember(owner = "client!EOQQYERM", name = "v", descriptor = "I")
    public int field595;

    @OriginalMember(owner = "client!EOQQYERM", name = "w", descriptor = "I")
    public int field596;

    @OriginalMember(owner = "client!EOQQYERM", name = "x", descriptor = "I")
    public int field597;

    @OriginalMember(owner = "client!EOQQYERM", name = "y", descriptor = "I")
    public int field598;

    @OriginalMember(owner = "client!EOQQYERM", name = "z", descriptor = "I")
    public int field599;

    @OriginalMember(owner = "client!EOQQYERM", name = "A", descriptor = "I")
    public int field600;

    @OriginalMember(owner = "client!EOQQYERM", name = "B", descriptor = "I")
    public int field601;

    @OriginalMember(owner = "client!EOQQYERM", name = "D", descriptor = "I")
    public int field603;

    @OriginalMember(owner = "client!EOQQYERM", name = "E", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "client!EOQQYERM", name = "F", descriptor = "I")
    public int field605;

    @OriginalMember(owner = "client!EOQQYERM", name = "J", descriptor = "I")
    private int field609;

    @OriginalMember(owner = "client!EOQQYERM", name = "K", descriptor = "I")
    private int field610;

    @OriginalMember(owner = "client!EOQQYERM", name = "L", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!EOQQYERM", name = "C", descriptor = "J")
    public long field602;

    @OriginalMember(owner = "client!EOQQYERM", name = "G", descriptor = "J")
    public long field606;

    @OriginalMember(owner = "client!EOQQYERM", name = "q", descriptor = "LHZYGKZDT;")
    public class20 field590;

    @OriginalMember(owner = "client!EOQQYERM", name = "s", descriptor = "LPXHNRURM;")
    public class38 field592;

    @OriginalMember(owner = "client!EOQQYERM", name = "p", descriptor = "Ljava/awt/Graphics;")
    public Graphics field589;

    @OriginalMember(owner = "client!EOQQYERM", name = "a", descriptor = "(III)V")
    public final void method189(int arg0, int arg1, int arg2) {
        this.field587 = arg0;
        this.field588 = arg2;
        this.field592 = new class38(this.field587, this.field588, 933, this);
        this.field589 = this.method109(-61).getGraphics();
        if (arg1 != 0) {
            this.field575 = !this.field575;
        }
        this.field590 = new class20(this.method109(-61), this.field587, 430, this.field588);
        this.method107(this, 1);
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "b", descriptor = "(III)V")
    public final void method190(int arg0, int arg1, int arg2) {
        this.field587 = arg0;
        this.field588 = arg1;
        this.field589 = this.method109(-61).getGraphics();
        this.field590 = new class20(this.method109(-61), this.field587, 430, this.field588);
        this.method107(this, 1);
        if (arg2 != -44916) {
            this.field580 = !this.field580;
        }
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "run", descriptor = "()V")
    public void run() {
        this.method109(-61).addMouseListener(this);
        this.method109(-61).addMouseMotionListener(this);
        this.method109(-61).addKeyListener(this);
        this.method109(-61).addFocusListener(this);
        if (this.field592 != null) {
            this.field592.addWindowListener(this);
        }
        this.method172(-23874, "Loading...", 0);
        this.method120();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field584[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field581 < 0) {
                    if (this.field581 == -1) {
                        this.method191((byte) 0);
                    }
                    return;
                }
                if (this.field581 > 0) {
                    this.field581--;
                    if (this.field581 == 0) {
                        this.method191((byte) 0);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field584[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field584[var1]) {
                    var2 = (int) ((long) (this.field582 * 2560) / (var11 - this.field584[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field582 - (var11 - this.field584[var1]) / 10L);
                }
                if (var3 > this.field582) {
                    var3 = this.field582;
                }
                this.field584[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field584[var13] != 0L) {
                            this.field584[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field583) {
                    var3 = this.field583;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field603 = this.field599;
                    this.field604 = this.field600;
                    this.field605 = this.field601;
                    this.field606 = this.field602;
                    this.field599 = 0;
                    this.method57(this.field578);
                    this.field609 = this.field610;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field582 > 0) {
                    this.field585 = var2 * 1000 / (this.field582 * 256);
                }
                this.method61(46632);
            } while (!this.field586);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field584[var15]);
            }
            System.out.println("fps:" + this.field585 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field582 + " mindel:" + this.field583);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field586 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "a", descriptor = "(B)V")
    public final void method191(byte arg0) {
        this.field581 = -2;
        if (this.field577 != arg0) {
            return;
        }
        this.method103(686);
        if (this.field592 == null) {
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

    @OriginalMember(owner = "client!EOQQYERM", name = "a", descriptor = "(ZI)V")
    public final void method192(boolean arg0, int arg1) {
        if (arg0) {
            this.field576 = -311;
        }
        this.field582 = 1000 / arg1;
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field581 >= 0) {
            this.field581 = 0;
        }
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field581 >= 0) {
            this.field581 = 4000 / this.field582;
        }
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field581 = -1;
        try {
            Thread.sleep(10000L);
        } catch (Exception var1) {
        }
        if (this.field581 == -1) {
            this.method191((byte) 0);
        }
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field589 == null) {
            this.field589 = arg0;
        }
        this.field593 = true;
        this.method64((byte) -120);
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field589 == null) {
            this.field589 = arg0;
        }
        this.field593 = true;
        this.method64((byte) -120);
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field592 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field595 = 0;
        this.field600 = var2;
        this.field601 = var3;
        this.field602 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field599 = 2;
            this.field596 = 2;
        } else {
            this.field599 = 1;
            this.field596 = 1;
        }
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field595 = 0;
        this.field596 = 0;
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field595 = 0;
        this.field597 = -1;
        this.field598 = -1;
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field592 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field595 = 0;
        this.field597 = var2;
        this.field598 = var3;
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field592 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field595 = 0;
        this.field597 = var2;
        this.field598 = var3;
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field595 = 0;
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
            this.field607[var3] = 1;
        }
        if (var3 > 4) {
            this.field608[this.field610] = var3;
            this.field610 = this.field610 + 1 & 0x7F;
        }
        if (class41.field1195) {
        }
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field595 = 0;
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
            this.field607[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "a", descriptor = "(I)I")
    public final int method193(int arg0) {
        int var2 = -1;
        if (arg0 != 0) {
            return this.field574;
        }
        if (this.field610 != this.field609) {
            var2 = this.field608[this.field609];
            this.field609 = this.field609 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field594 = true;
        this.field593 = true;
        this.method64((byte) -120);
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field594 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field607[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "a", descriptor = "()V")
    public void method120() {
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "b", descriptor = "(I)V")
    public void method57(int arg0) {
        if (this.field579 != arg0) {
            this.field579 = 124;
        }
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "c", descriptor = "(I)V")
    public void method103(int arg0) {
        int var2 = 52 / arg0;
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "d", descriptor = "(I)V")
    public void method61(int arg0) {
        if (arg0 == 46632) {
            ;
        }
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "b", descriptor = "(B)V")
    public void method64(byte arg0) {
        if (arg0 != -120) {
            this.field576 = 60;
        }
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "e", descriptor = "(I)Ljava/awt/Component;")
    public Component method109(int arg0) {
        while (arg0 >= 0) {
            this.field580 = !this.field580;
        }
        if (this.field592 == null) {
            return this;
        } else {
            return this.field592;
        }
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method107(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "client!EOQQYERM", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public void method172(int arg0, String arg1, int arg2) {
        while (this.field589 == null) {
            this.field589 = this.method109(-61).getGraphics();
            try {
                this.method109(-61).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method109(-61).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method109(-61).getFontMetrics(var6);
        if (this.field593) {
            this.field589.setColor(Color.black);
            this.field589.fillRect(0, 0, this.field587, this.field588);
            this.field593 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field588 / 2 - 18;
        this.field589.setColor(var7);
        this.field589.drawRect(this.field587 / 2 - 152, var8, 304, 34);
        this.field589.fillRect(this.field587 / 2 - 150, var8 + 2, arg2 * 3, 30);
        this.field589.setColor(Color.black);
        this.field589.fillRect(arg2 * 3 + this.field587 / 2 - 150, var8 + 2, 300 - arg2 * 3, 30);
        this.field589.setFont(var4);
        this.field589.setColor(Color.white);
        if (arg0 == -23874) {
            this.field589.drawString(arg1, (this.field587 - var5.stringWidth(arg1)) / 2, var8 + 22);
        }
    }
}
