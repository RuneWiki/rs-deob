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
    private int field1 = 2;

    @OriginalMember(owner = "a", name = "b", descriptor = "B")
    private byte field2 = 60;

    @OriginalMember(owner = "a", name = "c", descriptor = "I")
    private int field3 = -32411;

    @OriginalMember(owner = "a", name = "d", descriptor = "Z")
    private boolean field4 = true;

    @OriginalMember(owner = "a", name = "e", descriptor = "I")
    private int field5 = 2;

    @OriginalMember(owner = "a", name = "f", descriptor = "Z")
    private boolean field6 = true;

    @OriginalMember(owner = "a", name = "h", descriptor = "I")
    private int field8 = 20;

    @OriginalMember(owner = "a", name = "i", descriptor = "I")
    public int field9 = 1;

    @OriginalMember(owner = "a", name = "j", descriptor = "[J")
    private long[] field10 = new long[10];

    @OriginalMember(owner = "a", name = "l", descriptor = "Z")
    public boolean field12 = false;

    @OriginalMember(owner = "a", name = "q", descriptor = "[Ljb;")
    public Pix32[] field17 = new Pix32[6];

    @OriginalMember(owner = "a", name = "s", descriptor = "Z")
    public boolean field19 = true;

    @OriginalMember(owner = "a", name = "t", descriptor = "Z")
    public boolean field20 = true;

    @OriginalMember(owner = "a", name = "G", descriptor = "[I")
    public int[] field33 = new int[128];

    @OriginalMember(owner = "a", name = "H", descriptor = "[I")
    private int[] field34 = new int[128];

    @OriginalMember(owner = "a", name = "k", descriptor = "I")
    public int field11;

    @OriginalMember(owner = "a", name = "m", descriptor = "I")
    public int field13;

    @OriginalMember(owner = "a", name = "n", descriptor = "I")
    public int field14;

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

    @OriginalMember(owner = "a", name = "z", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "a", name = "A", descriptor = "I")
    public int field27;

    @OriginalMember(owner = "a", name = "C", descriptor = "I")
    public int field29;

    @OriginalMember(owner = "a", name = "D", descriptor = "I")
    public int field30;

    @OriginalMember(owner = "a", name = "E", descriptor = "I")
    public int field31;

    @OriginalMember(owner = "a", name = "I", descriptor = "I")
    private int field35;

    @OriginalMember(owner = "a", name = "J", descriptor = "I")
    private int field36;

    @OriginalMember(owner = "a", name = "K", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "a", name = "g", descriptor = "I")
    private int field7;

    @OriginalMember(owner = "a", name = "B", descriptor = "J")
    public long field28;

    @OriginalMember(owner = "a", name = "F", descriptor = "J")
    public long field32;

    @OriginalMember(owner = "a", name = "p", descriptor = "Lrb;")
    public PixMap field16;

    @OriginalMember(owner = "a", name = "r", descriptor = "Lb;")
    public ViewBox field18;

    @OriginalMember(owner = "a", name = "o", descriptor = "Ljava/awt/Graphics;")
    public Graphics field15;

    @OriginalMember(owner = "a", name = "a", descriptor = "(III)V")
    public final void method1(int arg0, int arg1, int arg2) {
        if (arg1 != 3) {
            return;
        }
        this.field13 = arg2;
        this.field14 = arg0;
        this.field18 = new ViewBox((byte) 3, this.field13, this, this.field14);
        this.field15 = this.method11(982).getGraphics();
        this.field16 = new PixMap(this.field13, this.field14, 0, this.method11(982));
        this.method12(this, 1);
    }

    @OriginalMember(owner = "a", name = "b", descriptor = "(III)V")
    public final void method2(int arg0, int arg1, int arg2) {
        this.field13 = arg1;
        this.field14 = arg0;
        this.field15 = this.method11(982).getGraphics();
        this.field16 = new PixMap(this.field13, this.field14, 0, this.method11(982));
        this.method12(this, 1);
        if (arg2 != 0) {
            this.field5 = -164;
        }
    }

    @OriginalMember(owner = "a", name = "run", descriptor = "()V")
    public void run() {
        this.method11(982).addMouseListener(this);
        this.method11(982).addMouseMotionListener(this);
        this.method11(982).addKeyListener(this);
        this.method11(982).addFocusListener(this);
        if (this.field18 != null) {
            this.field18.addWindowListener(this);
        }
        this.method13(0, 0, "Loading...");
        this.method6();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field10[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field7 < 0) {
                    if (this.field7 == -1) {
                        this.method3(this.field3);
                    }
                    return;
                }
                if (this.field7 > 0) {
                    this.field7--;
                    if (this.field7 == 0) {
                        this.method3(this.field3);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field10[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field10[var1]) {
                    var2 = (int) ((long) (this.field8 * 2560) / (var11 - this.field10[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field8 - (var11 - this.field10[var1]) / 10L);
                }
                if (var3 > this.field8) {
                    var3 = this.field8;
                }
                this.field10[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field10[var13] != 0L) {
                            this.field10[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field9) {
                    var3 = this.field9;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field29 = this.field25;
                    this.field30 = this.field26;
                    this.field31 = this.field27;
                    this.field32 = this.field28;
                    this.field25 = 0;
                    this.method7(-585);
                    this.field35 = this.field36;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field8 > 0) {
                    this.field11 = var2 * 1000 / (this.field8 * 256);
                }
                this.method9(53);
            } while (!this.field12);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field10[var15]);
            }
            System.out.println("fps:" + this.field11 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field8 + " mindel:" + this.field9);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field12 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(I)V")
    public final void method3(int arg0) {
        this.field7 = -2;
        if (arg0 != -32411) {
            return;
        }
        this.method8(false);
        if (this.field18 == null) {
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

    @OriginalMember(owner = "a", name = "a", descriptor = "(BI)V")
    public final void method4(byte arg0, int arg1) {
        this.field8 = 1000 / arg1;
        if (arg0 != 6) {
            this.field1 = 477;
        }
    }

    @OriginalMember(owner = "a", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field7 >= 0) {
            this.field7 = 0;
        }
    }

    @OriginalMember(owner = "a", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field7 >= 0) {
            this.field7 = 4000 / this.field8;
        }
    }

    @OriginalMember(owner = "a", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field7 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field7 == -1) {
            this.method3(this.field3);
        }
    }

    @OriginalMember(owner = "a", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field15 == null) {
            this.field15 = arg0;
        }
        this.field19 = true;
        this.method10(-114);
    }

    @OriginalMember(owner = "a", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field15 == null) {
            this.field15 = arg0;
        }
        this.field19 = true;
        this.method10(-114);
    }

    @OriginalMember(owner = "a", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field18 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field21 = 0;
        this.field26 = var2;
        this.field27 = var3;
        this.field28 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field25 = 2;
            this.field22 = 2;
        } else {
            this.field25 = 1;
            this.field22 = 1;
        }
        if (InputTracking.field153) {
            InputTracking.method49(0, var2, arg0.isMetaDown() ? 1 : 0, var3);
        }
    }

    @OriginalMember(owner = "a", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field21 = 0;
        this.field22 = 0;
        if (InputTracking.field153) {
            InputTracking.method50(arg0.isMetaDown() ? 1 : 0, (byte) 1);
        }
    }

    @OriginalMember(owner = "a", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
        if (InputTracking.field153) {
            InputTracking.method56((byte) 9);
        }
    }

    @OriginalMember(owner = "a", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field21 = 0;
        this.field23 = -1;
        this.field24 = -1;
        if (InputTracking.field153) {
            InputTracking.method57(false);
        }
    }

    @OriginalMember(owner = "a", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field18 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field21 = 0;
        this.field23 = var2;
        this.field24 = var3;
        if (InputTracking.field153) {
            InputTracking.method51((byte) 9, var2, var3);
        }
    }

    @OriginalMember(owner = "a", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field18 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field21 = 0;
        this.field23 = var2;
        this.field24 = var3;
        if (InputTracking.field153) {
            InputTracking.method51((byte) 9, var2, var3);
        }
    }

    @OriginalMember(owner = "a", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field21 = 0;
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
            this.field33[var3] = 1;
        }
        if (var3 > 4) {
            this.field34[this.field36] = var3;
            this.field36 = this.field36 + 1 & 0x7F;
        }
        if (InputTracking.field153) {
            InputTracking.method52(344, var3);
        }
        if (Linkable.field377) {
        }
    }

    @OriginalMember(owner = "a", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field21 = 0;
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
            this.field33[var3] = 0;
        }
        if (InputTracking.field153) {
            InputTracking.method53(1, var3);
        }
    }

    @OriginalMember(owner = "a", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "b", descriptor = "(I)I")
    public final int method5(int arg0) {
        int var2 = -1;
        int var3 = 78 / arg0;
        if (this.field36 != this.field35) {
            var2 = this.field34[this.field35];
            this.field35 = this.field35 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field20 = true;
        this.field19 = true;
        this.method10(-114);
        if (InputTracking.field153) {
            InputTracking.method54(this.field2);
        }
    }

    @OriginalMember(owner = "a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field20 = false;
        if (InputTracking.field153) {
            InputTracking.method55(0);
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
        while (arg0 >= 0) {
            this.field1 = 143;
        }
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(Z)V")
    public void method8(boolean arg0) {
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "a", name = "d", descriptor = "(I)V")
    public void method9(int arg0) {
        if (arg0 <= 0) {
            this.field6 = !this.field6;
        }
    }

    @OriginalMember(owner = "a", name = "e", descriptor = "(I)V")
    public void method10(int arg0) {
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "a", name = "f", descriptor = "(I)Ljava/awt/Component;")
    public java.awt.Component method11(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return this.field18 == null ? this : this.field18;
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method12(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(IILjava/lang/String;)V")
    public void method13(int arg0, int arg1, String arg2) {
        while (this.field15 == null) {
            this.field15 = this.method11(982).getGraphics();
            try {
                this.method11(982).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method11(982).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method11(982).getFontMetrics(var6);
        if (this.field19) {
            this.field15.setColor(Color.black);
            this.field15.fillRect(0, 0, this.field13, this.field14);
            this.field19 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field14 / 2 - 18;
        this.field15.setColor(var7);
        this.field15.drawRect(this.field13 / 2 - 152, var8, 304, 34);
        this.field15.fillRect(this.field13 / 2 - 150, var8 + 2, arg1 * 3, 30);
        this.field15.setColor(Color.black);
        if (arg0 != 0) {
            this.field4 = !this.field4;
        }
        this.field15.fillRect(arg1 * 3 + this.field13 / 2 - 150, var8 + 2, 300 - arg1 * 3, 30);
        this.field15.setFont(var4);
        this.field15.setColor(Color.white);
        this.field15.drawString(arg2, (this.field13 - var5.stringWidth(arg2)) / 2, var8 + 22);
    }
}
