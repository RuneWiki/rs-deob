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

    @OriginalMember(owner = "a", name = "a", descriptor = "I")
    private int field1 = 32319;

    @OriginalMember(owner = "a", name = "b", descriptor = "I")
    private int field2 = -1837;

    @OriginalMember(owner = "a", name = "c", descriptor = "I")
    private int field3 = 145;

    @OriginalMember(owner = "a", name = "e", descriptor = "I")
    private int field5 = -263;

    @OriginalMember(owner = "a", name = "f", descriptor = "B")
    private byte field6 = 59;

    @OriginalMember(owner = "a", name = "g", descriptor = "B")
    private byte field7 = -73;

    @OriginalMember(owner = "a", name = "h", descriptor = "Z")
    private boolean field8 = false;

    @OriginalMember(owner = "a", name = "i", descriptor = "I")
    private int field9 = 5100;

    @OriginalMember(owner = "a", name = "l", descriptor = "I")
    private int field12 = 20;

    @OriginalMember(owner = "a", name = "m", descriptor = "I")
    public int field13 = 1;

    @OriginalMember(owner = "a", name = "n", descriptor = "[J")
    private long[] field14 = new long[10];

    @OriginalMember(owner = "a", name = "p", descriptor = "Z")
    public boolean field16 = false;

    @OriginalMember(owner = "a", name = "u", descriptor = "[Ljb;")
    public Pix32[] field21 = new Pix32[6];

    @OriginalMember(owner = "a", name = "w", descriptor = "Z")
    public boolean field23 = true;

    @OriginalMember(owner = "a", name = "x", descriptor = "Z")
    public boolean field24 = true;

    @OriginalMember(owner = "a", name = "K", descriptor = "[I")
    public int[] field37 = new int[128];

    @OriginalMember(owner = "a", name = "L", descriptor = "[I")
    private int[] field38 = new int[128];

    @OriginalMember(owner = "a", name = "j", descriptor = "I")
    private int field10;

    @OriginalMember(owner = "a", name = "k", descriptor = "I")
    private int field11;

    @OriginalMember(owner = "a", name = "o", descriptor = "I")
    public int field15;

    @OriginalMember(owner = "a", name = "q", descriptor = "I")
    public int field17;

    @OriginalMember(owner = "a", name = "r", descriptor = "I")
    public int field18;

    @OriginalMember(owner = "a", name = "y", descriptor = "I")
    public int field25;

    @OriginalMember(owner = "a", name = "z", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "a", name = "A", descriptor = "I")
    public int field27;

    @OriginalMember(owner = "a", name = "B", descriptor = "I")
    public int field28;

    @OriginalMember(owner = "a", name = "C", descriptor = "I")
    public int field29;

    @OriginalMember(owner = "a", name = "D", descriptor = "I")
    public int field30;

    @OriginalMember(owner = "a", name = "E", descriptor = "I")
    public int field31;

    @OriginalMember(owner = "a", name = "G", descriptor = "I")
    public int field33;

    @OriginalMember(owner = "a", name = "H", descriptor = "I")
    public int field34;

    @OriginalMember(owner = "a", name = "I", descriptor = "I")
    public int field35;

    @OriginalMember(owner = "a", name = "M", descriptor = "I")
    private int field39;

    @OriginalMember(owner = "a", name = "d", descriptor = "I")
    private int field4;

    @OriginalMember(owner = "a", name = "N", descriptor = "I")
    private int field40;

    @OriginalMember(owner = "a", name = "O", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "a", name = "F", descriptor = "J")
    public long field32;

    @OriginalMember(owner = "a", name = "J", descriptor = "J")
    public long field36;

    @OriginalMember(owner = "a", name = "t", descriptor = "Lrb;")
    public PixMap field20;

    @OriginalMember(owner = "a", name = "v", descriptor = "Lb;")
    public ViewBox field22;

    @OriginalMember(owner = "a", name = "s", descriptor = "Ljava/awt/Graphics;")
    public Graphics field19;

    @OriginalMember(owner = "a", name = "a", descriptor = "(III)V")
    public final void method1(int arg0, int arg1, int arg2) {
        this.field17 = arg2;
        this.field18 = arg0;
        this.field22 = new ViewBox(this, this.field18, this.field17, this.field7);
        if (arg1 == 0) {
            this.field19 = this.method11(false).getGraphics();
            this.field20 = new PixMap(this.method11(false), this.field17, this.field18, this.field9);
            this.method12(this, 1);
        }
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(IIZ)V")
    public final void method2(int arg0, int arg1, boolean arg2) {
        this.field17 = arg1;
        this.field18 = arg0;
        this.field19 = this.method11(false).getGraphics();
        this.field20 = new PixMap(this.method11(false), this.field17, this.field18, this.field9);
        if (!arg2) {
            this.method12(this, 1);
        }
    }

    @OriginalMember(owner = "a", name = "run", descriptor = "()V")
    public void run() {
        this.method11(false).addMouseListener(this);
        this.method11(false).addMouseMotionListener(this);
        this.method11(false).addKeyListener(this);
        this.method11(false).addFocusListener(this);
        if (this.field22 != null) {
            this.field22.addWindowListener(this);
        }
        this.method13(8, "Loading...", 0);
        this.method6();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field14[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field11 < 0) {
                    if (this.field11 == -1) {
                        this.method3(927);
                    }
                    return;
                }
                if (this.field11 > 0) {
                    this.field11--;
                    if (this.field11 == 0) {
                        this.method3(927);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field14[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field14[var1]) {
                    var2 = (int) ((long) (this.field12 * 2560) / (var11 - this.field14[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field12 - (var11 - this.field14[var1]) / 10L);
                }
                if (var3 > this.field12) {
                    var3 = this.field12;
                }
                this.field14[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field14[var13] != 0L) {
                            this.field14[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field13) {
                    var3 = this.field13;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field33 = this.field29;
                    this.field34 = this.field30;
                    this.field35 = this.field31;
                    this.field36 = this.field32;
                    this.field29 = 0;
                    this.method7(false);
                    this.field39 = this.field40;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field12 > 0) {
                    this.field15 = var2 * 1000 / (this.field12 * 256);
                }
                this.method9(0);
            } while (!this.field16);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field14[var15]);
            }
            System.out.println("fps:" + this.field15 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field12 + " mindel:" + this.field13);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field16 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(I)V")
    public final void method3(int arg0) {
        this.field11 = -2;
        this.method8((byte) 1);
        int var2 = 64 / arg0;
        if (this.field22 == null) {
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

    @OriginalMember(owner = "a", name = "a", descriptor = "(II)V")
    public final void method4(int arg0, int arg1) {
        if (arg1 < 0) {
            this.field12 = 1000 / arg0;
        }
    }

    @OriginalMember(owner = "a", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field11 >= 0) {
            this.field11 = 0;
        }
    }

    @OriginalMember(owner = "a", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field11 >= 0) {
            this.field11 = 4000 / this.field12;
        }
    }

    @OriginalMember(owner = "a", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field11 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field11 == -1) {
            this.method3(927);
        }
    }

    @OriginalMember(owner = "a", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field19 == null) {
            this.field19 = arg0;
        }
        this.field23 = true;
        this.method10(false);
    }

    @OriginalMember(owner = "a", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field19 == null) {
            this.field19 = arg0;
        }
        this.field23 = true;
        this.method10(false);
    }

    @OriginalMember(owner = "a", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field22 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field25 = 0;
        this.field30 = var2;
        this.field31 = var3;
        this.field32 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field29 = 2;
            this.field26 = 2;
        } else {
            this.field29 = 1;
            this.field26 = 1;
        }
        if (InputTracking.field162) {
            InputTracking.method49(var3, arg0.isMetaDown() ? 1 : 0, var2, (byte) 118);
        }
    }

    @OriginalMember(owner = "a", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field25 = 0;
        this.field26 = 0;
        if (InputTracking.field162) {
            InputTracking.method50(arg0.isMetaDown() ? 1 : 0, 0);
        }
    }

    @OriginalMember(owner = "a", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
        if (InputTracking.field162) {
            InputTracking.method56(this.field4);
        }
    }

    @OriginalMember(owner = "a", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field25 = 0;
        this.field27 = -1;
        this.field28 = -1;
        if (InputTracking.field162) {
            InputTracking.method57(this.field5);
        }
    }

    @OriginalMember(owner = "a", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field22 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field25 = 0;
        this.field27 = var2;
        this.field28 = var3;
        if (InputTracking.field162) {
            InputTracking.method51(this.field1, var3, var2);
        }
    }

    @OriginalMember(owner = "a", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field22 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field25 = 0;
        this.field27 = var2;
        this.field28 = var3;
        if (InputTracking.field162) {
            InputTracking.method51(this.field1, var3, var2);
        }
    }

    @OriginalMember(owner = "a", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field25 = 0;
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
            this.field37[var3] = 1;
        }
        if (var3 > 4) {
            this.field38[this.field40] = var3;
            this.field40 = this.field40 + 1 & 0x7F;
        }
        if (InputTracking.field162) {
            InputTracking.method52(var3, this.field2);
        }
        if (Linkable.field393) {
        }
    }

    @OriginalMember(owner = "a", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field25 = 0;
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
            this.field37[var3] = 0;
        }
        if (InputTracking.field162) {
            InputTracking.method53(0, var3);
        }
    }

    @OriginalMember(owner = "a", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(B)I")
    public final int method5(byte arg0) {
        if (arg0 != 0) {
            return this.field10;
        }
        int var2 = -1;
        if (this.field40 != this.field39) {
            var2 = this.field38[this.field39];
            this.field39 = this.field39 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field24 = true;
        this.field23 = true;
        this.method10(false);
        if (InputTracking.field162) {
            InputTracking.method54((byte) 9);
        }
    }

    @OriginalMember(owner = "a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field24 = false;
        if (InputTracking.field162) {
            InputTracking.method55(this.field3);
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

    @OriginalMember(owner = "a", name = "a", descriptor = "(Z)V")
    public void method7(boolean arg0) {
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "a", name = "b", descriptor = "(B)V")
    public void method8(byte arg0) {
        if (arg0 == 1) {
            boolean var2 = false;
        } else {
            this.field3 = -372;
        }
    }

    @OriginalMember(owner = "a", name = "b", descriptor = "(I)V")
    public void method9(int arg0) {
        if (arg0 < 0 || arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "a", name = "b", descriptor = "(Z)V")
    public void method10(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "a", name = "c", descriptor = "(Z)Ljava/awt/Component;")
    public java.awt.Component method11(boolean arg0) {
        if (arg0) {
            this.field2 = -99;
        }
        return this.field22 == null ? this : this.field22;
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method12(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public void method13(int arg0, String arg1, int arg2) {
        while (this.field19 == null) {
            this.field19 = this.method11(false).getGraphics();
            try {
                this.method11(false).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method11(false).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method11(false).getFontMetrics(var6);
        if (this.field23) {
            this.field19.setColor(Color.black);
            this.field19.fillRect(0, 0, this.field17, this.field18);
            this.field23 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field18 / 2 - 18;
        this.field19.setColor(var7);
        this.field19.drawRect(this.field17 / 2 - 152, var8, 304, 34);
        this.field19.fillRect(this.field17 / 2 - 150, var8 + 2, arg2 * 3, 30);
        this.field19.setColor(Color.black);
        this.field19.fillRect(arg2 * 3 + this.field17 / 2 - 150, var8 + 2, 300 - arg2 * 3, 30);
        this.field19.setFont(var4);
        this.field19.setColor(Color.white);
        if (arg0 != 8) {
            this.field8 = !this.field8;
        }
        this.field19.drawString(arg1, (this.field17 - var5.stringWidth(arg1)) / 2, var8 + 22);
    }
}
