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

@OriginalClass("AYIVJZQQ")
public class class3 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "AYIVJZQQ", name = "a", descriptor = "I")
    private int field58 = -920;

    @OriginalMember(owner = "AYIVJZQQ", name = "b", descriptor = "B")
    private byte field59 = 64;

    @OriginalMember(owner = "AYIVJZQQ", name = "c", descriptor = "Z")
    private boolean field60 = true;

    @OriginalMember(owner = "AYIVJZQQ", name = "d", descriptor = "Z")
    private boolean field61 = true;

    @OriginalMember(owner = "AYIVJZQQ", name = "g", descriptor = "I")
    private int field64 = 20;

    @OriginalMember(owner = "AYIVJZQQ", name = "h", descriptor = "I")
    public int field65 = 1;

    @OriginalMember(owner = "AYIVJZQQ", name = "i", descriptor = "[J")
    private long[] field66 = new long[10];

    @OriginalMember(owner = "AYIVJZQQ", name = "k", descriptor = "Z")
    public boolean field68 = false;

    @OriginalMember(owner = "AYIVJZQQ", name = "p", descriptor = "[LINVDQNJU;")
    public class26[] field73 = new class26[6];

    @OriginalMember(owner = "AYIVJZQQ", name = "r", descriptor = "Z")
    public boolean field75 = true;

    @OriginalMember(owner = "AYIVJZQQ", name = "s", descriptor = "Z")
    public boolean field76 = true;

    @OriginalMember(owner = "AYIVJZQQ", name = "F", descriptor = "[I")
    public int[] field89 = new int[128];

    @OriginalMember(owner = "AYIVJZQQ", name = "G", descriptor = "[I")
    private int[] field90 = new int[128];

    @OriginalMember(owner = "AYIVJZQQ", name = "e", descriptor = "I")
    private int field62;

    @OriginalMember(owner = "AYIVJZQQ", name = "f", descriptor = "I")
    private int field63;

    @OriginalMember(owner = "AYIVJZQQ", name = "j", descriptor = "I")
    public int field67;

    @OriginalMember(owner = "AYIVJZQQ", name = "l", descriptor = "I")
    public int field69;

    @OriginalMember(owner = "AYIVJZQQ", name = "m", descriptor = "I")
    public int field70;

    @OriginalMember(owner = "AYIVJZQQ", name = "t", descriptor = "I")
    public int field77;

    @OriginalMember(owner = "AYIVJZQQ", name = "u", descriptor = "I")
    public int field78;

    @OriginalMember(owner = "AYIVJZQQ", name = "v", descriptor = "I")
    public int field79;

    @OriginalMember(owner = "AYIVJZQQ", name = "w", descriptor = "I")
    public int field80;

    @OriginalMember(owner = "AYIVJZQQ", name = "x", descriptor = "I")
    public int field81;

    @OriginalMember(owner = "AYIVJZQQ", name = "y", descriptor = "I")
    public int field82;

    @OriginalMember(owner = "AYIVJZQQ", name = "z", descriptor = "I")
    public int field83;

    @OriginalMember(owner = "AYIVJZQQ", name = "B", descriptor = "I")
    public int field85;

    @OriginalMember(owner = "AYIVJZQQ", name = "C", descriptor = "I")
    public int field86;

    @OriginalMember(owner = "AYIVJZQQ", name = "D", descriptor = "I")
    public int field87;

    @OriginalMember(owner = "AYIVJZQQ", name = "H", descriptor = "I")
    private int field91;

    @OriginalMember(owner = "AYIVJZQQ", name = "I", descriptor = "I")
    private int field92;

    @OriginalMember(owner = "AYIVJZQQ", name = "J", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "AYIVJZQQ", name = "A", descriptor = "J")
    public long field84;

    @OriginalMember(owner = "AYIVJZQQ", name = "E", descriptor = "J")
    public long field88;

    @OriginalMember(owner = "AYIVJZQQ", name = "o", descriptor = "LNUXCAHZM;")
    public class41 field72;

    @OriginalMember(owner = "AYIVJZQQ", name = "q", descriptor = "LYVSOOFAD;")
    public class69 field74;

    @OriginalMember(owner = "AYIVJZQQ", name = "n", descriptor = "Ljava/awt/Graphics;")
    public Graphics field71;

    @OriginalMember(owner = "AYIVJZQQ", name = "a", descriptor = "(III)V")
    public final void method14(int arg0, int arg1, int arg2) {
        this.field69 = arg2;
        this.field70 = arg1;
        this.field74 = new class69(this.field70, this.field69, this, false);
        if (arg0 < 0) {
            this.field71 = this.method24(-51).getGraphics();
            this.field72 = new class41(this.field70, this.field69, true, this.method24(-51));
            this.method25(this, 1);
        }
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "a", descriptor = "(IBI)V")
    public final void method15(int arg0, byte arg1, int arg2) {
        this.field69 = arg0;
        this.field70 = arg2;
        if (this.field59 != arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field71 = this.method24(-51).getGraphics();
        this.field72 = new class41(this.field70, this.field69, true, this.method24(-51));
        this.method25(this, 1);
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "run", descriptor = "()V")
    public void run() {
        this.method24(-51).addMouseListener(this);
        this.method24(-51).addMouseMotionListener(this);
        this.method24(-51).addKeyListener(this);
        this.method24(-51).addFocusListener(this);
        if (this.field74 != null) {
            this.field74.addWindowListener(this);
        }
        this.method26((byte) 62, 0, "Loading...");
        this.method19();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field66[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field63 < 0) {
                    if (this.field63 == -1) {
                        this.method16((byte) -30);
                    }
                    if (class62.field1590) {
                    }
                    return;
                }
                if (this.field63 > 0) {
                    this.field63--;
                    if (this.field63 == 0) {
                        this.method16((byte) -30);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field66[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field66[var1]) {
                    var2 = (int) ((long) (this.field64 * 2560) / (var11 - this.field66[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field64 - (var11 - this.field66[var1]) / 10L);
                }
                if (var3 > this.field64) {
                    var3 = this.field64;
                }
                this.field66[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field66[var13] != 0L) {
                            this.field66[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field65) {
                    var3 = this.field65;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field85 = this.field81;
                    this.field86 = this.field82;
                    this.field87 = this.field83;
                    this.field88 = this.field84;
                    this.field81 = 0;
                    this.method20((byte) 60);
                    this.field91 = this.field92;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field64 > 0) {
                    this.field67 = var2 * 1000 / (this.field64 * 256);
                }
                this.method22(1);
            } while (!this.field68);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field66[var15]);
            }
            System.out.println("fps:" + this.field67 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field64 + " mindel:" + this.field65);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field68 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "a", descriptor = "(B)V")
    public final void method16(byte arg0) {
        if (arg0 != -30) {
            return;
        }
        this.field63 = -2;
        this.method21(0);
        if (this.field74 == null) {
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

    @OriginalMember(owner = "AYIVJZQQ", name = "a", descriptor = "(IB)V")
    public final void method17(int arg0, byte arg1) {
        if (arg1 == 21) {
            this.field64 = 1000 / arg0;
        }
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field63 >= 0) {
            this.field63 = 0;
        }
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field63 >= 0) {
            this.field63 = 4000 / this.field64;
        }
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field63 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field63 == -1) {
            this.method16((byte) -30);
        }
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field71 == null) {
            this.field71 = arg0;
        }
        this.field75 = true;
        this.method23(111);
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field71 == null) {
            this.field71 = arg0;
        }
        this.field75 = true;
        this.method23(111);
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field74 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field77 = 0;
        this.field82 = var2;
        this.field83 = var3;
        this.field84 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field81 = 2;
            this.field78 = 2;
        } else {
            this.field81 = 1;
            this.field78 = 1;
        }
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field77 = 0;
        this.field78 = 0;
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field77 = 0;
        this.field79 = -1;
        this.field80 = -1;
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field74 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field77 = 0;
        this.field79 = var2;
        this.field80 = var3;
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field74 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field77 = 0;
        this.field79 = var2;
        this.field80 = var3;
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field77 = 0;
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
            this.field89[var3] = 1;
        }
        if (var3 > 4) {
            this.field90[this.field92] = var3;
            this.field92 = this.field92 + 1 & 0x7F;
        }
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field77 = 0;
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
            this.field89[var3] = 0;
        }
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "a", descriptor = "(Z)I")
    public final int method18(boolean arg0) {
        if (arg0) {
            this.field58 = 215;
        }
        int var2 = -1;
        if (this.field92 != this.field91) {
            var2 = this.field90[this.field91];
            this.field91 = this.field91 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field76 = true;
        this.field75 = true;
        this.method23(111);
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field76 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field89[var2] = 0;
        }
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "a", descriptor = "()V")
    public void method19() {
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "b", descriptor = "(B)V")
    public void method20(byte arg0) {
        if (arg0 != 60) {
            this.field61 = !this.field61;
        }
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "a", descriptor = "(I)V")
    public void method21(int arg0) {
        if (arg0 != 0) {
            this.field58 = 373;
        }
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "b", descriptor = "(I)V")
    public void method22(int arg0) {
        if (arg0 != 1) {
            this.field60 = !this.field60;
        }
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "c", descriptor = "(I)V")
    public void method23(int arg0) {
        if (arg0 <= 0) {
            this.field62 = 84;
        }
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "d", descriptor = "(I)Ljava/awt/Component;")
    public Component method24(int arg0) {
        while (arg0 >= 0) {
            this.field58 = 172;
        }
        if (this.field74 == null) {
            return this;
        } else {
            return this.field74;
        }
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method25(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "AYIVJZQQ", name = "a", descriptor = "(BILjava/lang/String;)V")
    public void method26(byte arg0, int arg1, String arg2) {
        while (this.field71 == null) {
            this.field71 = this.method24(-51).getGraphics();
            try {
                this.method24(-51).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        if (arg0 != 62) {
            return;
        }
        FontMetrics var5 = this.method24(-51).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method24(-51).getFontMetrics(var6);
        if (this.field75) {
            this.field71.setColor(Color.black);
            this.field71.fillRect(0, 0, this.field69, this.field70);
            this.field75 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field70 / 2 - 18;
        this.field71.setColor(var7);
        this.field71.drawRect(this.field69 / 2 - 152, var8, 304, 34);
        this.field71.fillRect(this.field69 / 2 - 150, var8 + 2, arg1 * 3, 30);
        this.field71.setColor(Color.black);
        this.field71.fillRect(arg1 * 3 + this.field69 / 2 - 150, var8 + 2, 300 - arg1 * 3, 30);
        this.field71.setFont(var4);
        this.field71.setColor(Color.white);
        this.field71.drawString(arg2, (this.field69 - var5.stringWidth(arg2)) / 2, var8 + 22);
    }
}
