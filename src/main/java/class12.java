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

@OriginalClass("DZXWUJSL")
public class class12 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "DZXWUJSL", name = "a", descriptor = "I")
    private int field702 = -348;

    @OriginalMember(owner = "DZXWUJSL", name = "b", descriptor = "Z")
    private boolean field703 = true;

    @OriginalMember(owner = "DZXWUJSL", name = "c", descriptor = "Z")
    private boolean field704 = true;

    @OriginalMember(owner = "DZXWUJSL", name = "e", descriptor = "Z")
    private boolean field706 = true;

    @OriginalMember(owner = "DZXWUJSL", name = "g", descriptor = "I")
    private int field708 = 20;

    @OriginalMember(owner = "DZXWUJSL", name = "h", descriptor = "I")
    public int field709 = 1;

    @OriginalMember(owner = "DZXWUJSL", name = "i", descriptor = "[J")
    private long[] field710 = new long[10];

    @OriginalMember(owner = "DZXWUJSL", name = "k", descriptor = "Z")
    public boolean field712 = false;

    @OriginalMember(owner = "DZXWUJSL", name = "p", descriptor = "[LSWNASVGQ;")
    public class51[] field717 = new class51[6];

    @OriginalMember(owner = "DZXWUJSL", name = "r", descriptor = "Z")
    public boolean field719 = true;

    @OriginalMember(owner = "DZXWUJSL", name = "s", descriptor = "Z")
    public boolean field720 = true;

    @OriginalMember(owner = "DZXWUJSL", name = "F", descriptor = "[I")
    public int[] field733 = new int[128];

    @OriginalMember(owner = "DZXWUJSL", name = "G", descriptor = "[I")
    private int[] field734 = new int[128];

    @OriginalMember(owner = "DZXWUJSL", name = "d", descriptor = "I")
    private int field705;

    @OriginalMember(owner = "DZXWUJSL", name = "f", descriptor = "I")
    private int field707;

    @OriginalMember(owner = "DZXWUJSL", name = "j", descriptor = "I")
    public int field711;

    @OriginalMember(owner = "DZXWUJSL", name = "l", descriptor = "I")
    public int field713;

    @OriginalMember(owner = "DZXWUJSL", name = "m", descriptor = "I")
    public int field714;

    @OriginalMember(owner = "DZXWUJSL", name = "t", descriptor = "I")
    public int field721;

    @OriginalMember(owner = "DZXWUJSL", name = "u", descriptor = "I")
    public int field722;

    @OriginalMember(owner = "DZXWUJSL", name = "v", descriptor = "I")
    public int field723;

    @OriginalMember(owner = "DZXWUJSL", name = "w", descriptor = "I")
    public int field724;

    @OriginalMember(owner = "DZXWUJSL", name = "x", descriptor = "I")
    public int field725;

    @OriginalMember(owner = "DZXWUJSL", name = "y", descriptor = "I")
    public int field726;

    @OriginalMember(owner = "DZXWUJSL", name = "z", descriptor = "I")
    public int field727;

    @OriginalMember(owner = "DZXWUJSL", name = "B", descriptor = "I")
    public int field729;

    @OriginalMember(owner = "DZXWUJSL", name = "C", descriptor = "I")
    public int field730;

    @OriginalMember(owner = "DZXWUJSL", name = "D", descriptor = "I")
    public int field731;

    @OriginalMember(owner = "DZXWUJSL", name = "H", descriptor = "I")
    private int field735;

    @OriginalMember(owner = "DZXWUJSL", name = "I", descriptor = "I")
    private int field736;

    @OriginalMember(owner = "DZXWUJSL", name = "J", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "DZXWUJSL", name = "A", descriptor = "J")
    public long field728;

    @OriginalMember(owner = "DZXWUJSL", name = "E", descriptor = "J")
    public long field732;

    @OriginalMember(owner = "DZXWUJSL", name = "q", descriptor = "LIOEGEBWF;")
    public class21 field718;

    @OriginalMember(owner = "DZXWUJSL", name = "o", descriptor = "LWOKQCNXG;")
    public class62 field716;

    @OriginalMember(owner = "DZXWUJSL", name = "n", descriptor = "Ljava/awt/Graphics;")
    public Graphics field715;

    @OriginalMember(owner = "DZXWUJSL", name = "a", descriptor = "(IZI)V")
    public final void method219(int arg0, boolean arg1, int arg2) {
        this.field713 = arg2;
        this.field714 = arg0;
        if (!arg1) {
            this.field718 = new class21(this.field714, this.field713, 12702, this);
            this.field715 = this.method122(false).getGraphics();
            this.field716 = new class62(this.field713, this.field714, 462, this.method122(false));
            this.method131(this, 1);
        }
    }

    @OriginalMember(owner = "DZXWUJSL", name = "a", descriptor = "(III)V")
    public final void method220(int arg0, int arg1, int arg2) {
        this.field713 = arg0;
        if (arg2 < 4 || arg2 > 4) {
            this.field706 = !this.field706;
        }
        this.field714 = arg1;
        this.field715 = this.method122(false).getGraphics();
        this.field716 = new class62(this.field713, this.field714, 462, this.method122(false));
        this.method131(this, 1);
    }

    @OriginalMember(owner = "DZXWUJSL", name = "run", descriptor = "()V")
    public void run() {
        this.method122(false).addMouseListener(this);
        this.method122(false).addMouseMotionListener(this);
        this.method122(false).addKeyListener(this);
        this.method122(false).addFocusListener(this);
        if (this.field718 != null) {
            this.field718.addWindowListener(this);
        }
        this.method142(0, "Loading...", true);
        this.method208();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field710[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field707 < 0) {
                    if (this.field707 == -1) {
                        this.method221(this.field702);
                    }
                    if (class38.field1221) {
                    }
                    return;
                }
                if (this.field707 > 0) {
                    this.field707--;
                    if (this.field707 == 0) {
                        this.method221(this.field702);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field710[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field710[var1]) {
                    var2 = (int) ((long) (this.field708 * 2560) / (var11 - this.field710[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field708 - (var11 - this.field710[var1]) / 10L);
                }
                if (var3 > this.field708) {
                    var3 = this.field708;
                }
                this.field710[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field710[var13] != 0L) {
                            this.field710[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field709) {
                    var3 = this.field709;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field729 = this.field725;
                    this.field730 = this.field726;
                    this.field731 = this.field727;
                    this.field732 = this.field728;
                    this.field725 = 0;
                    this.method93(this.field703);
                    this.field735 = this.field736;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field708 > 0) {
                    this.field711 = var2 * 1000 / (this.field708 * 256);
                }
                this.method100(725);
            } while (!this.field712);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field710[var15]);
            }
            System.out.println("fps:" + this.field711 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field708 + " mindel:" + this.field709);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field712 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "DZXWUJSL", name = "a", descriptor = "(I)V")
    public final void method221(int arg0) {
        this.field707 = -2;
        this.method204(24755);
        while (arg0 >= 0) {
            this.field702 = 82;
        }
        if (this.field718 == null) {
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

    @OriginalMember(owner = "DZXWUJSL", name = "a", descriptor = "(BI)V")
    public final void method222(byte arg0, int arg1) {
        if (arg0 != 29) {
            this.field703 = !this.field703;
        }
        this.field708 = 1000 / arg1;
    }

    @OriginalMember(owner = "DZXWUJSL", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field707 >= 0) {
            this.field707 = 0;
        }
    }

    @OriginalMember(owner = "DZXWUJSL", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field707 >= 0) {
            this.field707 = 4000 / this.field708;
        }
    }

    @OriginalMember(owner = "DZXWUJSL", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field707 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field707 == -1) {
            this.method221(this.field702);
        }
    }

    @OriginalMember(owner = "DZXWUJSL", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field715 == null) {
            this.field715 = arg0;
        }
        this.field719 = true;
        this.method98(856);
    }

    @OriginalMember(owner = "DZXWUJSL", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field715 == null) {
            this.field715 = arg0;
        }
        this.field719 = true;
        this.method98(856);
    }

    @OriginalMember(owner = "DZXWUJSL", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field718 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field721 = 0;
        this.field726 = var2;
        this.field727 = var3;
        this.field728 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field725 = 2;
            this.field722 = 2;
        } else {
            this.field725 = 1;
            this.field722 = 1;
        }
    }

    @OriginalMember(owner = "DZXWUJSL", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field721 = 0;
        this.field722 = 0;
    }

    @OriginalMember(owner = "DZXWUJSL", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "DZXWUJSL", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "DZXWUJSL", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field721 = 0;
        this.field723 = -1;
        this.field724 = -1;
    }

    @OriginalMember(owner = "DZXWUJSL", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field718 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field721 = 0;
        this.field723 = var2;
        this.field724 = var3;
    }

    @OriginalMember(owner = "DZXWUJSL", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field718 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field721 = 0;
        this.field723 = var2;
        this.field724 = var3;
    }

    @OriginalMember(owner = "DZXWUJSL", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field721 = 0;
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
            this.field733[var3] = 1;
        }
        if (var3 > 4) {
            this.field734[this.field736] = var3;
            this.field736 = this.field736 + 1 & 0x7F;
        }
    }

    @OriginalMember(owner = "DZXWUJSL", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field721 = 0;
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
            this.field733[var3] = 0;
        }
    }

    @OriginalMember(owner = "DZXWUJSL", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "DZXWUJSL", name = "a", descriptor = "(B)I")
    public final int method223(byte arg0) {
        if (arg0 == 6) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = -1;
        if (this.field736 != this.field735) {
            var4 = this.field734[this.field735];
            this.field735 = this.field735 + 1 & 0x7F;
        }
        return var4;
    }

    @OriginalMember(owner = "DZXWUJSL", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field720 = true;
        this.field719 = true;
        this.method98(856);
    }

    @OriginalMember(owner = "DZXWUJSL", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field720 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field733[var2] = 0;
        }
    }

    @OriginalMember(owner = "DZXWUJSL", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "DZXWUJSL", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "DZXWUJSL", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "DZXWUJSL", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "DZXWUJSL", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "DZXWUJSL", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "DZXWUJSL", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "DZXWUJSL", name = "a", descriptor = "()V")
    public void method208() {
    }

    @OriginalMember(owner = "DZXWUJSL", name = "a", descriptor = "(Z)V")
    public void method93(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "DZXWUJSL", name = "b", descriptor = "(I)V")
    public void method204(int arg0) {
        if (arg0 == 24755) {
            ;
        }
    }

    @OriginalMember(owner = "DZXWUJSL", name = "c", descriptor = "(I)V")
    public void method100(int arg0) {
        if (arg0 <= 0) {
            this.field705 = 261;
        }
    }

    @OriginalMember(owner = "DZXWUJSL", name = "d", descriptor = "(I)V")
    public void method98(int arg0) {
        int var2 = 21 / arg0;
    }

    @OriginalMember(owner = "DZXWUJSL", name = "b", descriptor = "(Z)Ljava/awt/Component;")
    public Component method122(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return this.field718 == null ? this : this.field718;
    }

    @OriginalMember(owner = "DZXWUJSL", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method131(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "DZXWUJSL", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public void method142(int arg0, String arg1, boolean arg2) {
        while (this.field715 == null) {
            this.field715 = this.method122(false).getGraphics();
            try {
                this.method122(false).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method122(false).getFontMetrics(var4);
        if (!arg2) {
            return;
        }
        Font var6 = new Font("Helvetica", 0, 13);
        this.method122(false).getFontMetrics(var6);
        if (this.field719) {
            this.field715.setColor(Color.black);
            this.field715.fillRect(0, 0, this.field713, this.field714);
            this.field719 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field714 / 2 - 18;
        this.field715.setColor(var7);
        this.field715.drawRect(this.field713 / 2 - 152, var8, 304, 34);
        this.field715.fillRect(this.field713 / 2 - 150, var8 + 2, arg0 * 3, 30);
        this.field715.setColor(Color.black);
        this.field715.fillRect(arg0 * 3 + this.field713 / 2 - 150, var8 + 2, 300 - arg0 * 3, 30);
        this.field715.setFont(var4);
        this.field715.setColor(Color.white);
        this.field715.drawString(arg1, (this.field713 - var5.stringWidth(arg1)) / 2, var8 + 22);
    }
}
