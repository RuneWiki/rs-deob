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

@OriginalClass("client!AHZQVBFX")
public class class3 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "client!AHZQVBFX", name = "a", descriptor = "I")
    private int field67 = -18411;

    @OriginalMember(owner = "client!AHZQVBFX", name = "c", descriptor = "Z")
    private boolean field69 = false;

    @OriginalMember(owner = "client!AHZQVBFX", name = "d", descriptor = "Z")
    private boolean field70 = false;

    @OriginalMember(owner = "client!AHZQVBFX", name = "e", descriptor = "Z")
    private boolean field71 = true;

    @OriginalMember(owner = "client!AHZQVBFX", name = "g", descriptor = "I")
    private int field73 = 20;

    @OriginalMember(owner = "client!AHZQVBFX", name = "h", descriptor = "I")
    public int field74 = 1;

    @OriginalMember(owner = "client!AHZQVBFX", name = "i", descriptor = "[J")
    private long[] field75 = new long[10];

    @OriginalMember(owner = "client!AHZQVBFX", name = "k", descriptor = "Z")
    public boolean field77 = false;

    @OriginalMember(owner = "client!AHZQVBFX", name = "p", descriptor = "[LOGPNACTP;")
    public class40[] field82 = new class40[6];

    @OriginalMember(owner = "client!AHZQVBFX", name = "r", descriptor = "Z")
    public boolean field84 = true;

    @OriginalMember(owner = "client!AHZQVBFX", name = "s", descriptor = "Z")
    public boolean field85 = true;

    @OriginalMember(owner = "client!AHZQVBFX", name = "F", descriptor = "[I")
    public int[] field98 = new int[128];

    @OriginalMember(owner = "client!AHZQVBFX", name = "G", descriptor = "[I")
    private int[] field99 = new int[128];

    @OriginalMember(owner = "client!AHZQVBFX", name = "H", descriptor = "I")
    private int field100;

    @OriginalMember(owner = "client!AHZQVBFX", name = "I", descriptor = "I")
    private int field101;

    @OriginalMember(owner = "client!AHZQVBFX", name = "J", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!AHZQVBFX", name = "b", descriptor = "I")
    private int field68;

    @OriginalMember(owner = "client!AHZQVBFX", name = "f", descriptor = "I")
    private int field72;

    @OriginalMember(owner = "client!AHZQVBFX", name = "j", descriptor = "I")
    public int field76;

    @OriginalMember(owner = "client!AHZQVBFX", name = "l", descriptor = "I")
    public int field78;

    @OriginalMember(owner = "client!AHZQVBFX", name = "m", descriptor = "I")
    public int field79;

    @OriginalMember(owner = "client!AHZQVBFX", name = "t", descriptor = "I")
    public int field86;

    @OriginalMember(owner = "client!AHZQVBFX", name = "u", descriptor = "I")
    public int field87;

    @OriginalMember(owner = "client!AHZQVBFX", name = "v", descriptor = "I")
    public int field88;

    @OriginalMember(owner = "client!AHZQVBFX", name = "w", descriptor = "I")
    public int field89;

    @OriginalMember(owner = "client!AHZQVBFX", name = "x", descriptor = "I")
    public int field90;

    @OriginalMember(owner = "client!AHZQVBFX", name = "y", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "client!AHZQVBFX", name = "z", descriptor = "I")
    public int field92;

    @OriginalMember(owner = "client!AHZQVBFX", name = "B", descriptor = "I")
    public int field94;

    @OriginalMember(owner = "client!AHZQVBFX", name = "C", descriptor = "I")
    public int field95;

    @OriginalMember(owner = "client!AHZQVBFX", name = "D", descriptor = "I")
    public int field96;

    @OriginalMember(owner = "client!AHZQVBFX", name = "A", descriptor = "J")
    public long field93;

    @OriginalMember(owner = "client!AHZQVBFX", name = "E", descriptor = "J")
    public long field97;

    @OriginalMember(owner = "client!AHZQVBFX", name = "q", descriptor = "LCVFADBZV;")
    public class12 field83;

    @OriginalMember(owner = "client!AHZQVBFX", name = "o", descriptor = "LHGHKUVEK;")
    public class26 field81;

    @OriginalMember(owner = "client!AHZQVBFX", name = "n", descriptor = "Ljava/awt/Graphics;")
    public Graphics field80;

    @OriginalMember(owner = "client!AHZQVBFX", name = "a", descriptor = "(III)V")
    public final void method14(int arg0, int arg1, int arg2) {
        this.field78 = arg0;
        this.field79 = arg1;
        this.field83 = new class12(-916, this, this.field78, this.field79);
        int var4 = 72 / arg2;
        this.field80 = this.method24(731).getGraphics();
        this.field81 = new class26((byte) 9, this.method24(731), this.field78, this.field79);
        this.method25(this, 1);
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "b", descriptor = "(III)V")
    public final void method15(int arg0, int arg1, int arg2) {
        this.field78 = arg2;
        this.field79 = arg1;
        if (arg0 != 5) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field80 = this.method24(731).getGraphics();
        this.field81 = new class26((byte) 9, this.method24(731), this.field78, this.field79);
        this.method25(this, 1);
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "run", descriptor = "()V")
    public void run() {
        this.method24(731).addMouseListener(this);
        this.method24(731).addMouseMotionListener(this);
        this.method24(731).addKeyListener(this);
        this.method24(731).addFocusListener(this);
        if (this.field83 != null) {
            this.field83.addWindowListener(this);
        }
        this.method26(0, "Loading...", 2);
        this.method19();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field75[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field72 < 0) {
                    if (this.field72 == -1) {
                        this.method16(603);
                    }
                    return;
                }
                if (this.field72 > 0) {
                    this.field72--;
                    if (this.field72 == 0) {
                        this.method16(603);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field75[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field75[var1]) {
                    var2 = (int) ((long) (this.field73 * 2560) / (var11 - this.field75[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field73 - (var11 - this.field75[var1]) / 10L);
                }
                if (var3 > this.field73) {
                    var3 = this.field73;
                }
                this.field75[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field75[var13] != 0L) {
                            this.field75[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field74) {
                    var3 = this.field74;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field94 = this.field90;
                    this.field95 = this.field91;
                    this.field96 = this.field92;
                    this.field97 = this.field93;
                    this.field90 = 0;
                    this.method20(10962);
                    this.field100 = this.field101;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field73 > 0) {
                    this.field76 = var2 * 1000 / (this.field73 * 256);
                }
                this.method22(9);
            } while (!this.field77);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field75[var15]);
            }
            System.out.println("fps:" + this.field76 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field73 + " mindel:" + this.field74);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field77 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "a", descriptor = "(I)V")
    public final void method16(int arg0) {
        this.field72 = -2;
        this.method21(this.field68);
        if (arg0 <= 0) {
            this.field67 = 101;
        }
        if (this.field83 == null) {
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

    @OriginalMember(owner = "client!AHZQVBFX", name = "a", descriptor = "(II)V")
    public final void method17(int arg0, int arg1) {
        if (arg0 != 7121) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field73 = 1000 / arg1;
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field72 >= 0) {
            this.field72 = 0;
        }
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field72 >= 0) {
            this.field72 = 4000 / this.field73;
        }
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field72 = -1;
        try {
            Thread.sleep(10000L);
        } catch (Exception var1) {
        }
        if (this.field72 == -1) {
            this.method16(603);
        }
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field80 == null) {
            this.field80 = arg0;
        }
        this.field84 = true;
        this.method23(7066);
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field80 == null) {
            this.field80 = arg0;
        }
        this.field84 = true;
        this.method23(7066);
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field83 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field86 = 0;
        this.field91 = var2;
        this.field92 = var3;
        this.field93 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field90 = 2;
            this.field87 = 2;
        } else {
            this.field90 = 1;
            this.field87 = 1;
        }
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field86 = 0;
        this.field87 = 0;
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field86 = 0;
        this.field88 = -1;
        this.field89 = -1;
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field83 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field86 = 0;
        this.field88 = var2;
        this.field89 = var3;
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field83 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field86 = 0;
        this.field88 = var2;
        this.field89 = var3;
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field86 = 0;
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
            this.field98[var3] = 1;
        }
        if (var3 > 4) {
            this.field99[this.field101] = var3;
            this.field101 = this.field101 + 1 & 0x7F;
        }
        if (class7.field142) {
        }
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field86 = 0;
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
            this.field98[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "b", descriptor = "(I)I")
    public final int method18(int arg0) {
        int var2 = -1;
        while (arg0 >= 0) {
            this.field71 = !this.field71;
        }
        if (this.field101 != this.field100) {
            var2 = this.field99[this.field100];
            this.field100 = this.field100 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field85 = true;
        this.field84 = true;
        this.method23(7066);
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field85 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field98[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "a", descriptor = "()V")
    public void method19() {
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "c", descriptor = "(I)V")
    public void method20(int arg0) {
        if (arg0 != 10962) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "d", descriptor = "(I)V")
    public void method21(int arg0) {
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "e", descriptor = "(I)V")
    public void method22(int arg0) {
        if (arg0 != 9) {
            this.field70 = !this.field70;
        }
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "f", descriptor = "(I)V")
    public void method23(int arg0) {
        if (arg0 != 7066) {
            this.field69 = !this.field69;
        }
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "g", descriptor = "(I)Ljava/awt/Component;")
    public Component method24(int arg0) {
        if (arg0 <= 0) {
            this.field70 = !this.field70;
        }
        return this.field83 == null ? this : this.field83;
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method25(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "client!AHZQVBFX", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public void method26(int arg0, String arg1, int arg2) {
        while (this.field80 == null) {
            this.field80 = this.method24(731).getGraphics();
            try {
                this.method24(731).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method24(731).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method24(731).getFontMetrics(var6);
        if (arg2 != 2) {
            this.field68 = 24;
        }
        if (this.field84) {
            this.field80.setColor(Color.black);
            this.field80.fillRect(0, 0, this.field78, this.field79);
            this.field84 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field79 / 2 - 18;
        this.field80.setColor(var7);
        this.field80.drawRect(this.field78 / 2 - 152, var8, 304, 34);
        this.field80.fillRect(this.field78 / 2 - 150, var8 + 2, arg0 * 3, 30);
        this.field80.setColor(Color.black);
        this.field80.fillRect(arg0 * 3 + this.field78 / 2 - 150, var8 + 2, 300 - arg0 * 3, 30);
        this.field80.setFont(var4);
        this.field80.setColor(Color.white);
        this.field80.drawString(arg1, (this.field78 - var5.stringWidth(arg1)) / 2, var8 + 22);
    }
}
