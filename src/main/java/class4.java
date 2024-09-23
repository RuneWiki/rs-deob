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

@OriginalClass("AUOBNYCU")
public class class4 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "AUOBNYCU", name = "a", descriptor = "I")
    private int field72 = -26684;

    @OriginalMember(owner = "AUOBNYCU", name = "c", descriptor = "Z")
    private boolean field74 = true;

    @OriginalMember(owner = "AUOBNYCU", name = "d", descriptor = "Z")
    private boolean field75 = false;

    @OriginalMember(owner = "AUOBNYCU", name = "f", descriptor = "I")
    private int field77 = 20;

    @OriginalMember(owner = "AUOBNYCU", name = "g", descriptor = "I")
    public int field78 = 1;

    @OriginalMember(owner = "AUOBNYCU", name = "h", descriptor = "[J")
    private long[] field79 = new long[10];

    @OriginalMember(owner = "AUOBNYCU", name = "j", descriptor = "Z")
    public boolean field81 = false;

    @OriginalMember(owner = "AUOBNYCU", name = "o", descriptor = "[LODBDSPMH;")
    public class40[] field86 = new class40[6];

    @OriginalMember(owner = "AUOBNYCU", name = "q", descriptor = "Z")
    public boolean field88 = true;

    @OriginalMember(owner = "AUOBNYCU", name = "r", descriptor = "Z")
    public boolean field89 = true;

    @OriginalMember(owner = "AUOBNYCU", name = "E", descriptor = "[I")
    public int[] field102 = new int[128];

    @OriginalMember(owner = "AUOBNYCU", name = "F", descriptor = "[I")
    private int[] field103 = new int[128];

    @OriginalMember(owner = "AUOBNYCU", name = "C", descriptor = "I")
    public int field100;

    @OriginalMember(owner = "AUOBNYCU", name = "G", descriptor = "I")
    private int field104;

    @OriginalMember(owner = "AUOBNYCU", name = "H", descriptor = "I")
    private int field105;

    @OriginalMember(owner = "AUOBNYCU", name = "I", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "AUOBNYCU", name = "b", descriptor = "I")
    private int field73;

    @OriginalMember(owner = "AUOBNYCU", name = "e", descriptor = "I")
    private int field76;

    @OriginalMember(owner = "AUOBNYCU", name = "i", descriptor = "I")
    public int field80;

    @OriginalMember(owner = "AUOBNYCU", name = "k", descriptor = "I")
    public int field82;

    @OriginalMember(owner = "AUOBNYCU", name = "l", descriptor = "I")
    public int field83;

    @OriginalMember(owner = "AUOBNYCU", name = "s", descriptor = "I")
    public int field90;

    @OriginalMember(owner = "AUOBNYCU", name = "t", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "AUOBNYCU", name = "u", descriptor = "I")
    public int field92;

    @OriginalMember(owner = "AUOBNYCU", name = "v", descriptor = "I")
    public int field93;

    @OriginalMember(owner = "AUOBNYCU", name = "w", descriptor = "I")
    public int field94;

    @OriginalMember(owner = "AUOBNYCU", name = "x", descriptor = "I")
    public int field95;

    @OriginalMember(owner = "AUOBNYCU", name = "y", descriptor = "I")
    public int field96;

    @OriginalMember(owner = "AUOBNYCU", name = "A", descriptor = "I")
    public int field98;

    @OriginalMember(owner = "AUOBNYCU", name = "B", descriptor = "I")
    public int field99;

    @OriginalMember(owner = "AUOBNYCU", name = "D", descriptor = "J")
    public long field101;

    @OriginalMember(owner = "AUOBNYCU", name = "z", descriptor = "J")
    public long field97;

    @OriginalMember(owner = "AUOBNYCU", name = "p", descriptor = "LALUUBUWO;")
    public class2 field87;

    @OriginalMember(owner = "AUOBNYCU", name = "n", descriptor = "LUKPRFGXO;")
    public class58 field85;

    @OriginalMember(owner = "AUOBNYCU", name = "m", descriptor = "Ljava/awt/Graphics;")
    public Graphics field84;

    @OriginalMember(owner = "AUOBNYCU", name = "a", descriptor = "(IBI)V")
    public final void method12(int arg0, byte arg1, int arg2) {
        this.field82 = arg0;
        this.field83 = arg2;
        this.field87 = new class2(this.field83, this, this.field82, 15);
        this.field84 = this.method22(true).getGraphics();
        this.field85 = new class58(this.field82, false, this.method22(true), this.field83);
        this.method23(this, 1);
        if (arg1 == 9) {
            boolean var4 = false;
        }
    }

    @OriginalMember(owner = "AUOBNYCU", name = "a", descriptor = "(III)V")
    public final void method13(int arg0, int arg1, int arg2) {
        this.field82 = arg0;
        this.field83 = arg2;
        if (arg1 >= 0) {
            this.field73 = -110;
        }
        this.field84 = this.method22(true).getGraphics();
        this.field85 = new class58(this.field82, false, this.method22(true), this.field83);
        this.method23(this, 1);
    }

    @OriginalMember(owner = "AUOBNYCU", name = "run", descriptor = "()V")
    public void run() {
        this.method22(true).addMouseListener(this);
        this.method22(true).addMouseMotionListener(this);
        this.method22(true).addKeyListener(this);
        this.method22(true).addFocusListener(this);
        if (this.field87 != null) {
            this.field87.addWindowListener(this);
        }
        this.method24("Loading...", (byte) 8, 0);
        this.method17();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field79[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field76 < 0) {
                    if (this.field76 == -1) {
                        this.method14(-870);
                    }
                    if (class30.field987) {
                    }
                    return;
                }
                if (this.field76 > 0) {
                    this.field76--;
                    if (this.field76 == 0) {
                        this.method14(-870);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field79[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field79[var1]) {
                    var2 = (int) ((long) (this.field77 * 2560) / (var11 - this.field79[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field77 - (var11 - this.field79[var1]) / 10L);
                }
                if (var3 > this.field77) {
                    var3 = this.field77;
                }
                this.field79[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field79[var13] != 0L) {
                            this.field79[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field78) {
                    var3 = this.field78;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field98 = this.field94;
                    this.field99 = this.field95;
                    this.field100 = this.field96;
                    this.field101 = this.field97;
                    this.field94 = 0;
                    this.method18(107);
                    this.field104 = this.field105;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field77 > 0) {
                    this.field80 = var2 * 1000 / (this.field77 * 256);
                }
                this.method20(this.field72);
            } while (!this.field81);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field79[var15]);
            }
            System.out.println("fps:" + this.field80 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field77 + " mindel:" + this.field78);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field81 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "AUOBNYCU", name = "a", descriptor = "(I)V")
    public final void method14(int arg0) {
        this.field76 = -2;
        if (arg0 >= 0) {
            return;
        }
        this.method19(957);
        if (this.field87 == null) {
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

    @OriginalMember(owner = "AUOBNYCU", name = "a", descriptor = "(ZI)V")
    public final void method15(boolean arg0, int arg1) {
        this.field77 = 1000 / arg1;
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "AUOBNYCU", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field76 >= 0) {
            this.field76 = 0;
        }
    }

    @OriginalMember(owner = "AUOBNYCU", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field76 >= 0) {
            this.field76 = 4000 / this.field77;
        }
    }

    @OriginalMember(owner = "AUOBNYCU", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field76 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field76 == -1) {
            this.method14(-870);
        }
    }

    @OriginalMember(owner = "AUOBNYCU", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field84 == null) {
            this.field84 = arg0;
        }
        this.field88 = true;
        this.method21((byte) 6);
    }

    @OriginalMember(owner = "AUOBNYCU", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field84 == null) {
            this.field84 = arg0;
        }
        this.field88 = true;
        this.method21((byte) 6);
    }

    @OriginalMember(owner = "AUOBNYCU", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field87 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field90 = 0;
        this.field95 = var2;
        this.field96 = var3;
        this.field97 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field94 = 2;
            this.field91 = 2;
        } else {
            this.field94 = 1;
            this.field91 = 1;
        }
    }

    @OriginalMember(owner = "AUOBNYCU", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field90 = 0;
        this.field91 = 0;
    }

    @OriginalMember(owner = "AUOBNYCU", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "AUOBNYCU", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "AUOBNYCU", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field90 = 0;
        this.field92 = -1;
        this.field93 = -1;
    }

    @OriginalMember(owner = "AUOBNYCU", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field87 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field90 = 0;
        this.field92 = var2;
        this.field93 = var3;
    }

    @OriginalMember(owner = "AUOBNYCU", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field87 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field90 = 0;
        this.field92 = var2;
        this.field93 = var3;
    }

    @OriginalMember(owner = "AUOBNYCU", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field90 = 0;
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
            this.field102[var3] = 1;
        }
        if (var3 > 4) {
            this.field103[this.field105] = var3;
            this.field105 = this.field105 + 1 & 0x7F;
        }
    }

    @OriginalMember(owner = "AUOBNYCU", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field90 = 0;
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
            this.field102[var3] = 0;
        }
    }

    @OriginalMember(owner = "AUOBNYCU", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "AUOBNYCU", name = "b", descriptor = "(I)I")
    public final int method16(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = -1;
        if (this.field105 != this.field104) {
            var3 = this.field103[this.field104];
            this.field104 = this.field104 + 1 & 0x7F;
        }
        return var3;
    }

    @OriginalMember(owner = "AUOBNYCU", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field89 = true;
        this.field88 = true;
        this.method21((byte) 6);
    }

    @OriginalMember(owner = "AUOBNYCU", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field89 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field102[var2] = 0;
        }
    }

    @OriginalMember(owner = "AUOBNYCU", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "AUOBNYCU", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "AUOBNYCU", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "AUOBNYCU", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "AUOBNYCU", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "AUOBNYCU", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "AUOBNYCU", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "AUOBNYCU", name = "a", descriptor = "()V")
    public void method17() {
    }

    @OriginalMember(owner = "AUOBNYCU", name = "c", descriptor = "(I)V")
    public void method18(int arg0) {
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "AUOBNYCU", name = "d", descriptor = "(I)V")
    public void method19(int arg0) {
        int var2 = 68 / arg0;
    }

    @OriginalMember(owner = "AUOBNYCU", name = "e", descriptor = "(I)V")
    public void method20(int arg0) {
        if (arg0 != -26684) {
            this.field74 = !this.field74;
        }
    }

    @OriginalMember(owner = "AUOBNYCU", name = "a", descriptor = "(B)V")
    public void method21(byte arg0) {
        if (arg0 == 6) {
            boolean var2 = false;
        }
    }

    @OriginalMember(owner = "AUOBNYCU", name = "a", descriptor = "(Z)Ljava/awt/Component;")
    public Component method22(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return this.field87 == null ? this : this.field87;
    }

    @OriginalMember(owner = "AUOBNYCU", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method23(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "AUOBNYCU", name = "a", descriptor = "(Ljava/lang/String;BI)V")
    public void method24(String arg0, byte arg1, int arg2) {
        while (this.field84 == null) {
            this.field84 = this.method22(true).getGraphics();
            try {
                this.method22(true).repaint();
            } catch (Exception var11) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var10) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method22(true).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        if (arg1 != 8) {
            return;
        }
        boolean var7 = false;
        this.method22(true).getFontMetrics(var6);
        if (this.field88) {
            this.field84.setColor(Color.black);
            this.field84.fillRect(0, 0, this.field82, this.field83);
            this.field88 = false;
        }
        Color var8 = new Color(140, 17, 17);
        int var9 = this.field83 / 2 - 18;
        this.field84.setColor(var8);
        this.field84.drawRect(this.field82 / 2 - 152, var9, 304, 34);
        this.field84.fillRect(this.field82 / 2 - 150, var9 + 2, arg2 * 3, 30);
        this.field84.setColor(Color.black);
        this.field84.fillRect(arg2 * 3 + this.field82 / 2 - 150, var9 + 2, 300 - arg2 * 3, 30);
        this.field84.setFont(var4);
        this.field84.setColor(Color.white);
        this.field84.drawString(arg0, (this.field82 - var5.stringWidth(arg0)) / 2, var9 + 22);
    }
}
