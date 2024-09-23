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

@OriginalClass("BTXFPMEV")
public class class7 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "BTXFPMEV", name = "a", descriptor = "Z")
    private boolean field81 = false;

    @OriginalMember(owner = "BTXFPMEV", name = "b", descriptor = "Z")
    private boolean field82 = false;

    @OriginalMember(owner = "BTXFPMEV", name = "c", descriptor = "B")
    private byte field83 = -32;

    @OriginalMember(owner = "BTXFPMEV", name = "d", descriptor = "B")
    private byte field84 = 93;

    @OriginalMember(owner = "BTXFPMEV", name = "e", descriptor = "B")
    private byte field85 = 3;

    @OriginalMember(owner = "BTXFPMEV", name = "f", descriptor = "Z")
    private boolean field86 = false;

    @OriginalMember(owner = "BTXFPMEV", name = "h", descriptor = "I")
    private int field88 = 20;

    @OriginalMember(owner = "BTXFPMEV", name = "i", descriptor = "I")
    public int field89 = 1;

    @OriginalMember(owner = "BTXFPMEV", name = "j", descriptor = "[J")
    private long[] field90 = new long[10];

    @OriginalMember(owner = "BTXFPMEV", name = "l", descriptor = "Z")
    public boolean field92 = false;

    @OriginalMember(owner = "BTXFPMEV", name = "q", descriptor = "[LDLNMSHLT;")
    public class12[] field97 = new class12[6];

    @OriginalMember(owner = "BTXFPMEV", name = "s", descriptor = "Z")
    public boolean field99 = true;

    @OriginalMember(owner = "BTXFPMEV", name = "t", descriptor = "Z")
    public boolean field100 = true;

    @OriginalMember(owner = "BTXFPMEV", name = "G", descriptor = "[I")
    public int[] field113 = new int[128];

    @OriginalMember(owner = "BTXFPMEV", name = "H", descriptor = "[I")
    private int[] field114 = new int[128];

    @OriginalMember(owner = "BTXFPMEV", name = "u", descriptor = "I")
    public int field101;

    @OriginalMember(owner = "BTXFPMEV", name = "v", descriptor = "I")
    public int field102;

    @OriginalMember(owner = "BTXFPMEV", name = "w", descriptor = "I")
    public int field103;

    @OriginalMember(owner = "BTXFPMEV", name = "x", descriptor = "I")
    public int field104;

    @OriginalMember(owner = "BTXFPMEV", name = "y", descriptor = "I")
    public int field105;

    @OriginalMember(owner = "BTXFPMEV", name = "z", descriptor = "I")
    public int field106;

    @OriginalMember(owner = "BTXFPMEV", name = "A", descriptor = "I")
    public int field107;

    @OriginalMember(owner = "BTXFPMEV", name = "C", descriptor = "I")
    public int field109;

    @OriginalMember(owner = "BTXFPMEV", name = "D", descriptor = "I")
    public int field110;

    @OriginalMember(owner = "BTXFPMEV", name = "E", descriptor = "I")
    public int field111;

    @OriginalMember(owner = "BTXFPMEV", name = "I", descriptor = "I")
    private int field115;

    @OriginalMember(owner = "BTXFPMEV", name = "J", descriptor = "I")
    private int field116;

    @OriginalMember(owner = "BTXFPMEV", name = "K", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "BTXFPMEV", name = "g", descriptor = "I")
    private int field87;

    @OriginalMember(owner = "BTXFPMEV", name = "k", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "BTXFPMEV", name = "m", descriptor = "I")
    public int field93;

    @OriginalMember(owner = "BTXFPMEV", name = "n", descriptor = "I")
    public int field94;

    @OriginalMember(owner = "BTXFPMEV", name = "B", descriptor = "J")
    public long field108;

    @OriginalMember(owner = "BTXFPMEV", name = "F", descriptor = "J")
    public long field112;

    @OriginalMember(owner = "BTXFPMEV", name = "r", descriptor = "LMOPGUTIE;")
    public class42 field98;

    @OriginalMember(owner = "BTXFPMEV", name = "p", descriptor = "LCMFQLMCT;")
    public class9 field96;

    @OriginalMember(owner = "BTXFPMEV", name = "o", descriptor = "Ljava/awt/Graphics;")
    public Graphics field95;

    @OriginalMember(owner = "BTXFPMEV", name = "a", descriptor = "(III)V")
    public final void method47(int arg0, int arg1, int arg2) {
        this.field93 = arg1;
        this.field94 = arg0;
        if (arg2 != 0) {
            this.field86 = !this.field86;
        }
        this.field98 = new class42(this, -24362, this.field94, this.field93);
        this.field95 = this.method57(this.field84).getGraphics();
        this.field96 = new class9(this.field93, this.method57(this.field84), this.field94, 912);
        this.method58(this, 1);
    }

    @OriginalMember(owner = "BTXFPMEV", name = "a", descriptor = "(ZII)V")
    public final void method48(boolean arg0, int arg1, int arg2) {
        this.field93 = arg2;
        if (!arg0) {
            this.field81 = !this.field81;
        }
        this.field94 = arg1;
        this.field95 = this.method57(this.field84).getGraphics();
        this.field96 = new class9(this.field93, this.method57(this.field84), this.field94, 912);
        this.method58(this, 1);
    }

    @OriginalMember(owner = "BTXFPMEV", name = "run", descriptor = "()V")
    public void run() {
        this.method57(this.field84).addMouseListener(this);
        this.method57(this.field84).addMouseMotionListener(this);
        this.method57(this.field84).addKeyListener(this);
        this.method57(this.field84).addFocusListener(this);
        if (this.field98 != null) {
            this.field98.addWindowListener(this);
        }
        this.method59("Loading...", 0, (byte) 3);
        this.method52();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field90[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field87 < 0) {
                    if (this.field87 == -1) {
                        this.method49(0);
                    }
                    return;
                }
                if (this.field87 > 0) {
                    this.field87--;
                    if (this.field87 == 0) {
                        this.method49(0);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field90[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field90[var1]) {
                    var2 = (int) ((long) (this.field88 * 2560) / (var11 - this.field90[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field88 - (var11 - this.field90[var1]) / 10L);
                }
                if (var3 > this.field88) {
                    var3 = this.field88;
                }
                this.field90[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field90[var13] != 0L) {
                            this.field90[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field89) {
                    var3 = this.field89;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field109 = this.field105;
                    this.field110 = this.field106;
                    this.field111 = this.field107;
                    this.field112 = this.field108;
                    this.field105 = 0;
                    this.method53(0);
                    this.field115 = this.field116;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field88 > 0) {
                    this.field91 = var2 * 1000 / (this.field88 * 256);
                }
                this.method55(-31159);
            } while (!this.field92);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field90[var15]);
            }
            System.out.println("fps:" + this.field91 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field88 + " mindel:" + this.field89);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field92 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "BTXFPMEV", name = "a", descriptor = "(I)V")
    public final void method49(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field87 = -2;
        this.method54((byte) -32);
        if (this.field98 == null) {
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

    @OriginalMember(owner = "BTXFPMEV", name = "a", descriptor = "(II)V")
    public final void method50(int arg0, int arg1) {
        this.field88 = 1000 / arg0;
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "BTXFPMEV", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field87 >= 0) {
            this.field87 = 0;
        }
    }

    @OriginalMember(owner = "BTXFPMEV", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field87 >= 0) {
            this.field87 = 4000 / this.field88;
        }
    }

    @OriginalMember(owner = "BTXFPMEV", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field87 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field87 == -1) {
            this.method49(0);
        }
    }

    @OriginalMember(owner = "BTXFPMEV", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field95 == null) {
            this.field95 = arg0;
        }
        this.field99 = true;
        this.method56(0);
    }

    @OriginalMember(owner = "BTXFPMEV", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field95 == null) {
            this.field95 = arg0;
        }
        this.field99 = true;
        this.method56(0);
    }

    @OriginalMember(owner = "BTXFPMEV", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field98 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field101 = 0;
        this.field106 = var2;
        this.field107 = var3;
        this.field108 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field105 = 2;
            this.field102 = 2;
        } else {
            this.field105 = 1;
            this.field102 = 1;
        }
    }

    @OriginalMember(owner = "BTXFPMEV", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field101 = 0;
        this.field102 = 0;
    }

    @OriginalMember(owner = "BTXFPMEV", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "BTXFPMEV", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "BTXFPMEV", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field101 = 0;
        this.field103 = -1;
        this.field104 = -1;
    }

    @OriginalMember(owner = "BTXFPMEV", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field98 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field101 = 0;
        this.field103 = var2;
        this.field104 = var3;
    }

    @OriginalMember(owner = "BTXFPMEV", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field98 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field101 = 0;
        this.field103 = var2;
        this.field104 = var3;
    }

    @OriginalMember(owner = "BTXFPMEV", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field101 = 0;
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
            this.field113[var3] = 1;
        }
        if (var3 > 4) {
            this.field114[this.field116] = var3;
            this.field116 = this.field116 + 1 & 0x7F;
        }
        if (class29.field878) {
        }
    }

    @OriginalMember(owner = "BTXFPMEV", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field101 = 0;
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
            this.field113[var3] = 0;
        }
    }

    @OriginalMember(owner = "BTXFPMEV", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "BTXFPMEV", name = "b", descriptor = "(I)I")
    public final int method51(int arg0) {
        if (arg0 != 46308) {
            this.field81 = !this.field81;
        }
        int var2 = -1;
        if (this.field116 != this.field115) {
            var2 = this.field114[this.field115];
            this.field115 = this.field115 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "BTXFPMEV", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field100 = true;
        this.field99 = true;
        this.method56(0);
    }

    @OriginalMember(owner = "BTXFPMEV", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field100 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field113[var2] = 0;
        }
    }

    @OriginalMember(owner = "BTXFPMEV", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "BTXFPMEV", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "BTXFPMEV", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "BTXFPMEV", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "BTXFPMEV", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "BTXFPMEV", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "BTXFPMEV", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "BTXFPMEV", name = "a", descriptor = "()V")
    public void method52() {
    }

    @OriginalMember(owner = "BTXFPMEV", name = "c", descriptor = "(I)V")
    public void method53(int arg0) {
        if (arg0 != 0) {
            this.field82 = !this.field82;
        }
    }

    @OriginalMember(owner = "BTXFPMEV", name = "a", descriptor = "(B)V")
    public void method54(byte arg0) {
        if (this.field83 == arg0) {
            ;
        }
    }

    @OriginalMember(owner = "BTXFPMEV", name = "d", descriptor = "(I)V")
    public void method55(int arg0) {
        if (arg0 != -31159) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "BTXFPMEV", name = "e", descriptor = "(I)V")
    public void method56(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "BTXFPMEV", name = "b", descriptor = "(B)Ljava/awt/Component;")
    public Component method57(byte arg0) {
        if (this.field84 != arg0) {
            throw new NullPointerException();
        }
        return this.field98 == null ? this : this.field98;
    }

    @OriginalMember(owner = "BTXFPMEV", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method58(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "BTXFPMEV", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    public void method59(String arg0, int arg1, byte arg2) {
        while (this.field95 == null) {
            this.field95 = this.method57(this.field84).getGraphics();
            try {
                this.method57(this.field84).repaint();
            } catch (Exception var11) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var10) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method57(this.field84).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method57(this.field84).getFontMetrics(var6);
        if (this.field85 != arg2) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (this.field99) {
            this.field95.setColor(Color.black);
            this.field95.fillRect(0, 0, this.field93, this.field94);
            this.field99 = false;
        }
        Color var8 = new Color(140, 17, 17);
        int var9 = this.field94 / 2 - 18;
        this.field95.setColor(var8);
        this.field95.drawRect(this.field93 / 2 - 152, var9, 304, 34);
        this.field95.fillRect(this.field93 / 2 - 150, var9 + 2, arg1 * 3, 30);
        this.field95.setColor(Color.black);
        this.field95.fillRect(arg1 * 3 + this.field93 / 2 - 150, var9 + 2, 300 - arg1 * 3, 30);
        this.field95.setFont(var4);
        this.field95.setColor(Color.white);
        this.field95.drawString(arg0, (this.field93 - var5.stringWidth(arg0)) / 2, var9 + 22);
    }
}
