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
    private boolean field1 = true;

    @OriginalMember(owner = "a", name = "b", descriptor = "I")
    private int field2 = 471;

    @OriginalMember(owner = "a", name = "c", descriptor = "Z")
    private boolean field3 = true;

    @OriginalMember(owner = "a", name = "e", descriptor = "I")
    private int field5 = 20;

    @OriginalMember(owner = "a", name = "f", descriptor = "I")
    public int field6 = 1;

    @OriginalMember(owner = "a", name = "g", descriptor = "[J")
    private long[] field7 = new long[10];

    @OriginalMember(owner = "a", name = "i", descriptor = "Z")
    public boolean field9 = false;

    @OriginalMember(owner = "a", name = "n", descriptor = "[Lib;")
    public Pix32[] field14 = new Pix32[6];

    @OriginalMember(owner = "a", name = "p", descriptor = "Z")
    public boolean field16 = true;

    @OriginalMember(owner = "a", name = "q", descriptor = "Z")
    public boolean field17 = true;

    @OriginalMember(owner = "a", name = "D", descriptor = "[I")
    public int[] field30 = new int[128];

    @OriginalMember(owner = "a", name = "E", descriptor = "[I")
    private int[] field31 = new int[128];

    @OriginalMember(owner = "a", name = "j", descriptor = "I")
    public int field10;

    @OriginalMember(owner = "a", name = "k", descriptor = "I")
    public int field11;

    @OriginalMember(owner = "a", name = "r", descriptor = "I")
    public int field18;

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

    @OriginalMember(owner = "a", name = "z", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "a", name = "A", descriptor = "I")
    public int field27;

    @OriginalMember(owner = "a", name = "B", descriptor = "I")
    public int field28;

    @OriginalMember(owner = "a", name = "F", descriptor = "I")
    private int field32;

    @OriginalMember(owner = "a", name = "G", descriptor = "I")
    private int field33;

    @OriginalMember(owner = "a", name = "H", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "a", name = "d", descriptor = "I")
    private int field4;

    @OriginalMember(owner = "a", name = "h", descriptor = "I")
    public int field8;

    @OriginalMember(owner = "a", name = "y", descriptor = "J")
    public long field25;

    @OriginalMember(owner = "a", name = "C", descriptor = "J")
    public long field29;

    @OriginalMember(owner = "a", name = "m", descriptor = "Lqb;")
    public PixMap field13;

    @OriginalMember(owner = "a", name = "o", descriptor = "Lb;")
    public ViewBox field15;

    @OriginalMember(owner = "a", name = "l", descriptor = "Ljava/awt/Graphics;")
    public Graphics field12;

    @OriginalMember(owner = "a", name = "a", descriptor = "(BII)V")
    public final void method1(byte arg0, int arg1, int arg2) {
        this.field10 = arg1;
        this.field11 = arg2;
        if (arg0 != 2) {
            return;
        }
        boolean var4 = false;
        this.field15 = new ViewBox(this.field10, 2, this.field11, this);
        this.field12 = this.method11(-290).getGraphics();
        this.field13 = new PixMap(this.method11(-290), 0, this.field11, this.field10);
        this.method12(this, 1);
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(ZII)V")
    public final void method2(boolean arg0, int arg1, int arg2) {
        this.field10 = arg2;
        this.field11 = arg1;
        this.field12 = this.method11(-290).getGraphics();
        if (arg0) {
            this.field13 = new PixMap(this.method11(-290), 0, this.field11, this.field10);
            this.method12(this, 1);
        }
    }

    @OriginalMember(owner = "a", name = "run", descriptor = "()V")
    public void run() {
        this.method11(-290).addMouseListener(this);
        this.method11(-290).addMouseMotionListener(this);
        this.method11(-290).addKeyListener(this);
        this.method11(-290).addFocusListener(this);
        if (this.field15 != null) {
            this.field15.addWindowListener(this);
        }
        this.method13(0, (byte) 1, "Loading...");
        this.method6();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field7[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field4 < 0) {
                    if (this.field4 == -1) {
                        this.method3(this.field2);
                    }
                    if (Linkable.field362) {
                    }
                    return;
                }
                if (this.field4 > 0) {
                    this.field4--;
                    if (this.field4 == 0) {
                        this.method3(this.field2);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field7[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field7[var1]) {
                    var2 = (int) ((long) (this.field5 * 2560) / (var11 - this.field7[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field5 - (var11 - this.field7[var1]) / 10L);
                }
                if (var3 > this.field5) {
                    var3 = this.field5;
                }
                this.field7[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field7[var13] != 0L) {
                            this.field7[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field6) {
                    var3 = this.field6;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field26 = this.field22;
                    this.field27 = this.field23;
                    this.field28 = this.field24;
                    this.field29 = this.field25;
                    this.field22 = 0;
                    this.method7(true);
                    this.field32 = this.field33;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field5 > 0) {
                    this.field8 = var2 * 1000 / (this.field5 * 256);
                }
                this.method9((byte) 9);
            } while (!this.field9);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field7[var15]);
            }
            System.out.println("fps:" + this.field8 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field5 + " mindel:" + this.field6);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field9 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(I)V")
    public final void method3(int arg0) {
        int var2 = 55 / arg0;
        this.field4 = -2;
        this.method8(true);
        if (this.field15 == null) {
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
        if (arg0 != 15425) {
            this.field1 = !this.field1;
        }
        this.field5 = 1000 / arg1;
    }

    @OriginalMember(owner = "a", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field4 >= 0) {
            this.field4 = 0;
        }
    }

    @OriginalMember(owner = "a", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field4 >= 0) {
            this.field4 = 4000 / this.field5;
        }
    }

    @OriginalMember(owner = "a", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field4 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field4 == -1) {
            this.method3(this.field2);
        }
    }

    @OriginalMember(owner = "a", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field12 == null) {
            this.field12 = arg0;
        }
        this.field16 = true;
        this.method10(35628);
    }

    @OriginalMember(owner = "a", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field12 == null) {
            this.field12 = arg0;
        }
        this.field16 = true;
        this.method10(35628);
    }

    @OriginalMember(owner = "a", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field15 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field18 = 0;
        this.field23 = var2;
        this.field24 = var3;
        this.field25 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field22 = 2;
            this.field19 = 2;
        } else {
            this.field22 = 1;
            this.field19 = 1;
        }
    }

    @OriginalMember(owner = "a", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field18 = 0;
        this.field19 = 0;
    }

    @OriginalMember(owner = "a", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field18 = 0;
        this.field20 = -1;
        this.field21 = -1;
    }

    @OriginalMember(owner = "a", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field15 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field18 = 0;
        this.field20 = var2;
        this.field21 = var3;
    }

    @OriginalMember(owner = "a", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field15 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field18 = 0;
        this.field20 = var2;
        this.field21 = var3;
    }

    @OriginalMember(owner = "a", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field18 = 0;
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
            this.field30[var3] = 1;
        }
        if (var3 > 4) {
            this.field31[this.field33] = var3;
            this.field33 = this.field33 + 1 & 0x7F;
        }
    }

    @OriginalMember(owner = "a", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field18 = 0;
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
            this.field30[var3] = 0;
        }
    }

    @OriginalMember(owner = "a", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "b", descriptor = "(I)I")
    public final int method5(int arg0) {
        int var2 = 96 / arg0;
        int var3 = -1;
        if (this.field33 != this.field32) {
            var3 = this.field31[this.field32];
            this.field32 = this.field32 + 1 & 0x7F;
        }
        return var3;
    }

    @OriginalMember(owner = "a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field17 = true;
        this.field16 = true;
        this.method10(35628);
    }

    @OriginalMember(owner = "a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field17 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field30[var2] = 0;
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
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "a", name = "b", descriptor = "(Z)V")
    public void method8(boolean arg0) {
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(B)V")
    public void method9(byte arg0) {
        if (arg0 != 9) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "a", name = "c", descriptor = "(I)V")
    public void method10(int arg0) {
        if (arg0 == 35628) {
            ;
        }
    }

    @OriginalMember(owner = "a", name = "d", descriptor = "(I)Ljava/awt/Component;")
    public java.awt.Component method11(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return this.field15 == null ? this : this.field15;
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method12(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(IBLjava/lang/String;)V")
    public void method13(int arg0, byte arg1, String arg2) {
        if (arg1 != 1) {
            return;
        }
        boolean var4 = false;
        while (this.field12 == null) {
            this.field12 = this.method11(-290).getGraphics();
            try {
                this.method11(-290).repaint();
            } catch (Exception var11) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var10) {
            }
        }
        Font var5 = new Font("Helvetica", 1, 13);
        FontMetrics var6 = this.method11(-290).getFontMetrics(var5);
        Font var7 = new Font("Helvetica", 0, 13);
        this.method11(-290).getFontMetrics(var7);
        if (this.field16) {
            this.field12.setColor(Color.black);
            this.field12.fillRect(0, 0, this.field10, this.field11);
            this.field16 = false;
        }
        Color var8 = new Color(140, 17, 17);
        int var9 = this.field11 / 2 - 18;
        this.field12.setColor(var8);
        this.field12.drawRect(this.field10 / 2 - 152, var9, 304, 34);
        this.field12.fillRect(this.field10 / 2 - 150, var9 + 2, arg0 * 3, 30);
        this.field12.setColor(Color.black);
        this.field12.fillRect(arg0 * 3 + this.field10 / 2 - 150, var9 + 2, 300 - arg0 * 3, 30);
        this.field12.setFont(var5);
        this.field12.setColor(Color.white);
        this.field12.drawString(arg2, (this.field10 - var6.stringWidth(arg2)) / 2, var9 + 22);
    }
}
