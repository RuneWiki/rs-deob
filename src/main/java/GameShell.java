import java.applet.Applet;
import java.awt.Color;
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

@OriginalClass("a")
public class GameShell extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "a", name = "a", descriptor = "Z")
    private boolean field1 = false;

    @OriginalMember(owner = "a", name = "b", descriptor = "I")
    private int field2 = -128;

    @OriginalMember(owner = "a", name = "c", descriptor = "I")
    private int field3 = 37395;

    @OriginalMember(owner = "a", name = "d", descriptor = "I")
    private int field4 = -6002;

    @OriginalMember(owner = "a", name = "f", descriptor = "I")
    private int field6 = 20;

    @OriginalMember(owner = "a", name = "g", descriptor = "I")
    public int field7 = 1;

    @OriginalMember(owner = "a", name = "h", descriptor = "[J")
    private long[] field8 = new long[10];

    @OriginalMember(owner = "a", name = "j", descriptor = "Z")
    public boolean field10 = false;

    @OriginalMember(owner = "a", name = "o", descriptor = "[Lib;")
    public Pix32[] field15 = new Pix32[6];

    @OriginalMember(owner = "a", name = "q", descriptor = "Z")
    public boolean field17 = true;

    @OriginalMember(owner = "a", name = "r", descriptor = "Z")
    public boolean field18 = true;

    @OriginalMember(owner = "a", name = "E", descriptor = "[I")
    public int[] field31 = new int[128];

    @OriginalMember(owner = "a", name = "F", descriptor = "[I")
    private int[] field32 = new int[128];

    @OriginalMember(owner = "a", name = "k", descriptor = "I")
    public int field11;

    @OriginalMember(owner = "a", name = "l", descriptor = "I")
    public int field12;

    @OriginalMember(owner = "a", name = "s", descriptor = "I")
    public int field19;

    @OriginalMember(owner = "a", name = "t", descriptor = "I")
    public int field20;

    @OriginalMember(owner = "a", name = "u", descriptor = "I")
    public int field21;

    @OriginalMember(owner = "a", name = "v", descriptor = "I")
    public int field22;

    @OriginalMember(owner = "a", name = "w", descriptor = "I")
    public int field23;

    @OriginalMember(owner = "a", name = "x", descriptor = "I")
    public int field24;

    @OriginalMember(owner = "a", name = "y", descriptor = "I")
    public int field25;

    @OriginalMember(owner = "a", name = "A", descriptor = "I")
    public int field27;

    @OriginalMember(owner = "a", name = "B", descriptor = "I")
    public int field28;

    @OriginalMember(owner = "a", name = "C", descriptor = "I")
    public int field29;

    @OriginalMember(owner = "a", name = "G", descriptor = "I")
    private int field33;

    @OriginalMember(owner = "a", name = "H", descriptor = "I")
    private int field34;

    @OriginalMember(owner = "a", name = "e", descriptor = "I")
    private int field5;

    @OriginalMember(owner = "a", name = "i", descriptor = "I")
    public int field9;

    @OriginalMember(owner = "a", name = "z", descriptor = "J")
    public long field26;

    @OriginalMember(owner = "a", name = "D", descriptor = "J")
    public long field30;

    @OriginalMember(owner = "a", name = "n", descriptor = "Lqb;")
    public PixMap field14;

    @OriginalMember(owner = "a", name = "p", descriptor = "Lb;")
    public ViewBox field16;

    @OriginalMember(owner = "a", name = "m", descriptor = "Ljava/awt/Graphics;")
    public Graphics field13;

    @OriginalMember(owner = "a", name = "I", descriptor = "Z")
    public static boolean field35;

    @OriginalMember(owner = "a", name = "a", descriptor = "(III)V")
    public final void method1(int arg0, int arg1, int arg2) {
        this.field11 = arg1;
        this.field12 = arg0;
        this.field16 = new ViewBox(this.field12, 27016, this.field11, this);
        this.field13 = this.method11(7).getGraphics();
        if (arg2 != 0) {
            this.field4 = -480;
        }
        this.field14 = new PixMap(this.method11(7), this.field11, this.field12, 2);
        this.method12(this, 1);
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(ZII)V")
    public final void method2(boolean arg0, int arg1, int arg2) {
        this.field11 = arg1;
        if (!arg0) {
            this.field3 = 4;
        }
        this.field12 = arg2;
        this.field13 = this.method11(7).getGraphics();
        this.field14 = new PixMap(this.method11(7), this.field11, this.field12, 2);
        this.method12(this, 1);
    }

    @OriginalMember(owner = "a", name = "run", descriptor = "()V")
    public void run() {
        this.method11(7).addMouseListener(this);
        this.method11(7).addMouseMotionListener(this);
        this.method11(7).addKeyListener(this);
        this.method11(7).addFocusListener(this);
        if (this.field16 != null) {
            this.field16.addWindowListener(this);
        }
        this.method13(false, 0, "Loading...");
        this.method6();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field8[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field5 < 0) {
                    if (this.field5 == -1) {
                        this.method3(0);
                    }
                    return;
                }
                if (this.field5 > 0) {
                    this.field5--;
                    if (this.field5 == 0) {
                        this.method3(0);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field8[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field8[var1]) {
                    var2 = (int) ((long) (this.field6 * 2560) / (var11 - this.field8[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field6 - (var11 - this.field8[var1]) / 10L);
                }
                if (var3 > this.field6) {
                    var3 = this.field6;
                }
                this.field8[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field8[var13] != 0L) {
                            this.field8[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field7) {
                    var3 = this.field7;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field27 = this.field23;
                    this.field28 = this.field24;
                    this.field29 = this.field25;
                    this.field30 = this.field26;
                    this.field23 = 0;
                    this.method7(9);
                    this.field33 = this.field34;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field6 > 0) {
                    this.field9 = var2 * 1000 / (this.field6 * 256);
                }
                this.method9((byte) 1);
            } while (!this.field10);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field8[var15]);
            }
            System.out.println("fps:" + this.field9 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field6 + " mindel:" + this.field7);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field10 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(I)V")
    public final void method3(int arg0) {
        this.field5 = -2;
        this.method8(874);
        if (arg0 != 0 || this.field16 == null) {
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

    @OriginalMember(owner = "a", name = "a", descriptor = "(II)V")
    public final void method4(int arg0, int arg1) {
        if (arg1 > 0) {
            this.field6 = 1000 / arg0;
        }
    }

    @OriginalMember(owner = "a", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field5 >= 0) {
            this.field5 = 0;
        }
    }

    @OriginalMember(owner = "a", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field5 >= 0) {
            this.field5 = 4000 / this.field6;
        }
    }

    @OriginalMember(owner = "a", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field5 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field5 == -1) {
            this.method3(0);
        }
    }

    @OriginalMember(owner = "a", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field13 == null) {
            this.field13 = arg0;
        }
        this.field17 = true;
        this.method10(false);
    }

    @OriginalMember(owner = "a", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field13 == null) {
            this.field13 = arg0;
        }
        this.field17 = true;
        this.method10(false);
    }

    @OriginalMember(owner = "a", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field16 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field19 = 0;
        this.field24 = var2;
        this.field25 = var3;
        this.field26 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field23 = 2;
            this.field20 = 2;
        } else {
            this.field23 = 1;
            this.field20 = 1;
        }
    }

    @OriginalMember(owner = "a", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field19 = 0;
        this.field20 = 0;
    }

    @OriginalMember(owner = "a", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field19 = 0;
        this.field21 = -1;
        this.field22 = -1;
    }

    @OriginalMember(owner = "a", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field16 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field19 = 0;
        this.field21 = var2;
        this.field22 = var3;
    }

    @OriginalMember(owner = "a", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field16 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field19 = 0;
        this.field21 = var2;
        this.field22 = var3;
    }

    @OriginalMember(owner = "a", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field19 = 0;
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
            this.field31[var3] = 1;
        }
        if (var3 > 4) {
            this.field32[this.field34] = var3;
            this.field34 = this.field34 + 1 & 0x7F;
        }
        if (Linkable.field361) {
        }
    }

    @OriginalMember(owner = "a", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field19 = 0;
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
            this.field31[var3] = 0;
        }
    }

    @OriginalMember(owner = "a", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "b", descriptor = "(I)I")
    public final int method5(int arg0) {
        int var2 = -1;
        if (arg0 >= 0) {
            this.field1 = !this.field1;
        }
        if (this.field34 != this.field33) {
            var2 = this.field32[this.field33];
            this.field33 = this.field33 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field18 = true;
        this.field17 = true;
        this.method10(false);
    }

    @OriginalMember(owner = "a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field18 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field31[var2] = 0;
        }
    }

    @OriginalMember(owner = "a", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "a", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "()V")
    public void method6() {
    }

    @OriginalMember(owner = "a", name = "c", descriptor = "(I)V")
    public void method7(int arg0) {
        if (arg0 == 9) {
            ;
        }
    }

    @OriginalMember(owner = "a", name = "d", descriptor = "(I)V")
    public void method8(int arg0) {
        int var2 = 38 / arg0;
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(B)V")
    public void method9(byte arg0) {
        if (arg0 != 1) {
            this.field1 = !this.field1;
        }
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(Z)V")
    public void method10(boolean arg0) {
        if (arg0) {
            this.field3 = 244;
        }
    }

    @OriginalMember(owner = "a", name = "e", descriptor = "(I)Ljava/awt/Component;")
    public java.awt.Component method11(int arg0) {
        if (arg0 != 7) {
            throw new NullPointerException();
        }
        return this.field16 == null ? this : this.field16;
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method12(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public void method13(boolean arg0, int arg1, String arg2) {
        while (this.field13 == null) {
            this.field13 = this.method11(7).getGraphics();
            try {
                this.method11(7).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method11(7).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method11(7).getFontMetrics(var6);
        if (this.field17) {
            this.field13.setColor(Color.black);
            this.field13.fillRect(0, 0, this.field11, this.field12);
            this.field17 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field12 / 2 - 18;
        this.field13.setColor(var7);
        this.field13.drawRect(this.field11 / 2 - 152, var8, 304, 34);
        this.field13.fillRect(this.field11 / 2 - 150, var8 + 2, arg1 * 3, 30);
        this.field13.setColor(Color.black);
        this.field13.fillRect(arg1 * 3 + this.field11 / 2 - 150, var8 + 2, 300 - arg1 * 3, 30);
        this.field13.setFont(var4);
        this.field13.setColor(Color.white);
        this.field13.drawString(arg2, (this.field11 - var5.stringWidth(arg2)) / 2, var8 + 22);
        if (!arg0) {
            ;
        }
    }
}
