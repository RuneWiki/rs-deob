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
    private int field1 = 800;

    @OriginalMember(owner = "a", name = "b", descriptor = "I")
    private int field2 = 495;

    @OriginalMember(owner = "a", name = "c", descriptor = "B")
    private byte field3 = 0;

    @OriginalMember(owner = "a", name = "d", descriptor = "B")
    private byte field4 = 0;

    @OriginalMember(owner = "a", name = "e", descriptor = "B")
    private byte field5 = 68;

    @OriginalMember(owner = "a", name = "f", descriptor = "B")
    private byte field6 = -43;

    @OriginalMember(owner = "a", name = "g", descriptor = "B")
    private byte field7 = 9;

    @OriginalMember(owner = "a", name = "h", descriptor = "Z")
    private boolean field8 = true;

    @OriginalMember(owner = "a", name = "j", descriptor = "I")
    private int field10 = 20;

    @OriginalMember(owner = "a", name = "k", descriptor = "I")
    public int field11 = 1;

    @OriginalMember(owner = "a", name = "l", descriptor = "[J")
    private long[] field12 = new long[10];

    @OriginalMember(owner = "a", name = "n", descriptor = "Z")
    public boolean field14 = false;

    @OriginalMember(owner = "a", name = "s", descriptor = "[Ljb;")
    public Pix32[] field19 = new Pix32[6];

    @OriginalMember(owner = "a", name = "u", descriptor = "Z")
    public boolean field21 = true;

    @OriginalMember(owner = "a", name = "C", descriptor = "[I")
    public int[] field29 = new int[128];

    @OriginalMember(owner = "a", name = "D", descriptor = "[I")
    private int[] field30 = new int[128];

    @OriginalMember(owner = "a", name = "m", descriptor = "I")
    public int field13;

    @OriginalMember(owner = "a", name = "o", descriptor = "I")
    public int field15;

    @OriginalMember(owner = "a", name = "p", descriptor = "I")
    public int field16;

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

    @OriginalMember(owner = "a", name = "B", descriptor = "I")
    public int field28;

    @OriginalMember(owner = "a", name = "E", descriptor = "I")
    private int field31;

    @OriginalMember(owner = "a", name = "F", descriptor = "I")
    private int field32;

    @OriginalMember(owner = "a", name = "G", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "a", name = "i", descriptor = "I")
    private int field9;

    @OriginalMember(owner = "a", name = "r", descriptor = "Lrb;")
    public PixMap field18;

    @OriginalMember(owner = "a", name = "t", descriptor = "Lb;")
    public ViewBox field20;

    @OriginalMember(owner = "a", name = "q", descriptor = "Ljava/awt/Graphics;")
    public Graphics field17;

    @OriginalMember(owner = "a", name = "a", descriptor = "(III)V")
    public final void method1(int arg0, int arg1, int arg2) {
        this.field15 = arg0;
        this.field16 = arg1;
        this.field20 = new ViewBox(this.field15, (byte) 81, this.field16, this);
        this.field17 = this.method11(this.field7).getGraphics();
        this.field18 = new PixMap((byte) 9, this.field16, this.field15, this.method11(this.field7));
        if (arg2 > 0) {
            this.method12(this, 1);
        }
    }

    @OriginalMember(owner = "a", name = "b", descriptor = "(III)V")
    public final void method2(int arg0, int arg1, int arg2) {
        this.field15 = arg2;
        this.field16 = arg1;
        this.field17 = this.method11(this.field7).getGraphics();
        if (arg0 != 0) {
            this.field8 = !this.field8;
        }
        this.field18 = new PixMap((byte) 9, this.field16, this.field15, this.method11(this.field7));
        this.method12(this, 1);
    }

    @OriginalMember(owner = "a", name = "run", descriptor = "()V")
    public void run() {
        this.method11(this.field7).addMouseListener(this);
        this.method11(this.field7).addMouseMotionListener(this);
        this.method11(this.field7).addKeyListener(this);
        this.method11(this.field7).addFocusListener(this);
        if (this.field20 != null) {
            this.field20.addWindowListener(this);
        }
        this.method13("Loading...", (byte) 4, 0);
        this.method6();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field12[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field9 < 0) {
                    if (this.field9 == -1) {
                        this.method3((byte) 0);
                    }
                    return;
                }
                if (this.field9 > 0) {
                    this.field9--;
                    if (this.field9 == 0) {
                        this.method3((byte) 0);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field12[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field12[var1]) {
                    var2 = (int) ((long) (this.field10 * 2560) / (var11 - this.field12[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field10 - (var11 - this.field12[var1]) / 10L);
                }
                if (var3 > this.field10) {
                    var3 = this.field10;
                }
                this.field12[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field12[var13] != 0L) {
                            this.field12[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field11) {
                    var3 = this.field11;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.method7(true);
                    this.field26 = 0;
                    this.field31 = this.field32;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field10 > 0) {
                    this.field13 = var2 * 1000 / (this.field10 * 256);
                }
                this.method9(447);
            } while (!this.field14);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field12[var15]);
            }
            System.out.println("fps:" + this.field13 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field10 + " mindel:" + this.field11);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field14 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(B)V")
    public final void method3(byte arg0) {
        this.field9 = -2;
        this.method8((byte) 68);
        if (this.field3 != arg0) {
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

    @OriginalMember(owner = "a", name = "a", descriptor = "(IB)V")
    public final void method4(int arg0, byte arg1) {
        if (this.field4 == arg1) {
            this.field10 = 1000 / arg0;
        }
    }

    @OriginalMember(owner = "a", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field9 >= 0) {
            this.field9 = 0;
        }
    }

    @OriginalMember(owner = "a", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field9 >= 0) {
            this.field9 = 4000 / this.field10;
        }
    }

    @OriginalMember(owner = "a", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field9 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field9 == -1) {
            this.method3((byte) 0);
        }
    }

    @OriginalMember(owner = "a", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field17 == null) {
            this.field17 = arg0;
        }
        this.field21 = true;
        this.method10((byte) -43);
    }

    @OriginalMember(owner = "a", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field17 == null) {
            this.field17 = arg0;
        }
        this.field21 = true;
        this.method10((byte) -43);
    }

    @OriginalMember(owner = "a", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field20 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field22 = 0;
        this.field27 = var2;
        this.field28 = var3;
        if (arg0.isMetaDown()) {
            this.field26 = 2;
            this.field23 = 2;
        } else {
            this.field26 = 1;
            this.field23 = 1;
        }
        if (InputTracking.field143) {
            InputTracking.method48(arg0.isMetaDown() ? 1 : 0, (byte) 7, var2, var3);
        }
    }

    @OriginalMember(owner = "a", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field22 = 0;
        this.field23 = 0;
        if (InputTracking.field143) {
            InputTracking.method49(false, arg0.isMetaDown() ? 1 : 0);
        }
    }

    @OriginalMember(owner = "a", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
        if (InputTracking.field143) {
            InputTracking.method55(6);
        }
    }

    @OriginalMember(owner = "a", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        if (InputTracking.field143) {
            InputTracking.method56(true);
        }
    }

    @OriginalMember(owner = "a", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field20 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field22 = 0;
        this.field24 = var2;
        this.field25 = var3;
        if (InputTracking.field143) {
            InputTracking.method50(true, var3, var2);
        }
    }

    @OriginalMember(owner = "a", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field20 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field22 = 0;
        this.field24 = var2;
        this.field25 = var3;
        if (InputTracking.field143) {
            InputTracking.method50(true, var3, var2);
        }
    }

    @OriginalMember(owner = "a", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field22 = 0;
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
            this.field29[var3] = 1;
        }
        if (var3 > 4) {
            this.field30[this.field32] = var3;
            this.field32 = this.field32 + 1 & 0x7F;
        }
        if (InputTracking.field143) {
            InputTracking.method51(var3, (byte) 7);
        }
        if (Linkable.field369) {
        }
    }

    @OriginalMember(owner = "a", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field22 = 0;
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
            this.field29[var3] = 0;
        }
        if (InputTracking.field143) {
            InputTracking.method52(this.field2, var3);
        }
    }

    @OriginalMember(owner = "a", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field21 = true;
        this.method10((byte) -43);
        if (InputTracking.field143) {
            InputTracking.method53((byte) 5);
        }
    }

    @OriginalMember(owner = "a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        if (InputTracking.field143) {
            InputTracking.method54((byte) -91);
        }
    }

    @OriginalMember(owner = "a", name = "b", descriptor = "(B)I")
    public final int method5(byte arg0) {
        int var2 = -1;
        if (arg0 == 7) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (this.field32 != this.field31) {
            var2 = this.field30[this.field31];
            this.field31 = this.field31 + 1 & 0x7F;
        }
        return var2;
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
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "a", name = "c", descriptor = "(B)V")
    public void method8(byte arg0) {
        if (this.field5 != arg0) {
            this.field1 = 473;
        }
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(I)V")
    public void method9(int arg0) {
        int var2 = 20 / arg0;
    }

    @OriginalMember(owner = "a", name = "d", descriptor = "(B)V")
    public void method10(byte arg0) {
        if (this.field6 != arg0) {
            this.field8 = !this.field8;
        }
    }

    @OriginalMember(owner = "a", name = "e", descriptor = "(B)Ljava/awt/Component;")
    public java.awt.Component method11(byte arg0) {
        if (arg0 == 9) {
            boolean var2 = false;
        } else {
            this.field8 = !this.field8;
        }
        return this.field20 == null ? this : this.field20;
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method12(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(Ljava/lang/String;BI)V")
    public void method13(String arg0, byte arg1, int arg2) {
        while (this.field17 == null) {
            this.field17 = this.method11(this.field7).getGraphics();
            try {
                this.method11(this.field7).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method11(this.field7).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method11(this.field7).getFontMetrics(var6);
        if (this.field21) {
            this.field17.setColor(Color.black);
            this.field17.fillRect(0, 0, this.field15, this.field16);
            this.field21 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field16 / 2 - 18;
        this.field17.setColor(var7);
        this.field17.drawRect(this.field15 / 2 - 152, var8, 304, 34);
        this.field17.fillRect(this.field15 / 2 - 150, var8 + 2, arg2 * 3, 30);
        this.field17.setColor(Color.black);
        this.field17.fillRect(arg2 * 3 + this.field15 / 2 - 150, var8 + 2, 300 - arg2 * 3, 30);
        this.field17.setFont(var4);
        this.field17.setColor(Color.white);
        this.field17.drawString(arg0, (this.field15 - var5.stringWidth(arg0)) / 2, var8 + 22);
        if (arg1 == 4) {
            ;
        }
    }
}
