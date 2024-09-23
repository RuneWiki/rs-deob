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

    @OriginalMember(owner = "a", name = "b", descriptor = "B")
    private byte field2 = 7;

    @OriginalMember(owner = "a", name = "c", descriptor = "I")
    private int field3 = 2;

    @OriginalMember(owner = "a", name = "d", descriptor = "I")
    private int field4 = 5;

    @OriginalMember(owner = "a", name = "e", descriptor = "Z")
    private boolean field5 = false;

    @OriginalMember(owner = "a", name = "g", descriptor = "I")
    private int field7 = 20;

    @OriginalMember(owner = "a", name = "h", descriptor = "I")
    public int field8 = 1;

    @OriginalMember(owner = "a", name = "i", descriptor = "[J")
    private long[] field9 = new long[10];

    @OriginalMember(owner = "a", name = "k", descriptor = "Z")
    public boolean field11 = false;

    @OriginalMember(owner = "a", name = "p", descriptor = "[Lib;")
    public Pix32[] field16 = new Pix32[6];

    @OriginalMember(owner = "a", name = "r", descriptor = "Z")
    public boolean field18 = true;

    @OriginalMember(owner = "a", name = "s", descriptor = "Z")
    public boolean field19 = true;

    @OriginalMember(owner = "a", name = "F", descriptor = "[I")
    public int[] field32 = new int[128];

    @OriginalMember(owner = "a", name = "G", descriptor = "[I")
    private int[] field33 = new int[128];

    @OriginalMember(owner = "a", name = "j", descriptor = "I")
    public int field10;

    @OriginalMember(owner = "a", name = "l", descriptor = "I")
    public int field12;

    @OriginalMember(owner = "a", name = "m", descriptor = "I")
    public int field13;

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

    @OriginalMember(owner = "a", name = "z", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "a", name = "B", descriptor = "I")
    public int field28;

    @OriginalMember(owner = "a", name = "C", descriptor = "I")
    public int field29;

    @OriginalMember(owner = "a", name = "D", descriptor = "I")
    public int field30;

    @OriginalMember(owner = "a", name = "H", descriptor = "I")
    private int field34;

    @OriginalMember(owner = "a", name = "I", descriptor = "I")
    private int field35;

    @OriginalMember(owner = "a", name = "f", descriptor = "I")
    private int field6;

    @OriginalMember(owner = "a", name = "A", descriptor = "J")
    public long field27;

    @OriginalMember(owner = "a", name = "E", descriptor = "J")
    public long field31;

    @OriginalMember(owner = "a", name = "o", descriptor = "Lqb;")
    public PixMap field15;

    @OriginalMember(owner = "a", name = "q", descriptor = "Lb;")
    public ViewBox field17;

    @OriginalMember(owner = "a", name = "n", descriptor = "Ljava/awt/Graphics;")
    public Graphics field14;

    @OriginalMember(owner = "a", name = "J", descriptor = "Z")
    public static boolean field36;

    @OriginalMember(owner = "a", name = "a", descriptor = "(ZII)V")
    public final void method1(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            this.field4 = 171;
        }
        this.field12 = arg1;
        this.field13 = arg2;
        this.field17 = new ViewBox(this, this.field12, this.field13, 0);
        this.field14 = this.method11(this.field2).getGraphics();
        this.field15 = new PixMap(this.field13, this.field3, this.field12, this.method11(this.field2));
        this.method12(this, 1);
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(IIB)V")
    public final void method2(int arg0, int arg1, byte arg2) {
        if (arg2 != 23) {
            return;
        }
        this.field12 = arg1;
        this.field13 = arg0;
        this.field14 = this.method11(this.field2).getGraphics();
        this.field15 = new PixMap(this.field13, this.field3, this.field12, this.method11(this.field2));
        this.method12(this, 1);
    }

    @OriginalMember(owner = "a", name = "run", descriptor = "()V")
    public void run() {
        this.method11(this.field2).addMouseListener(this);
        this.method11(this.field2).addMouseMotionListener(this);
        this.method11(this.field2).addKeyListener(this);
        this.method11(this.field2).addFocusListener(this);
        if (this.field17 != null) {
            this.field17.addWindowListener(this);
        }
        this.method13("Loading...", 0, 7);
        this.method6();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field9[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field6 < 0) {
                    if (this.field6 == -1) {
                        this.method3(6568);
                    }
                    return;
                }
                if (this.field6 > 0) {
                    this.field6--;
                    if (this.field6 == 0) {
                        this.method3(6568);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field9[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field9[var1]) {
                    var2 = (int) ((long) (this.field7 * 2560) / (var11 - this.field9[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field7 - (var11 - this.field9[var1]) / 10L);
                }
                if (var3 > this.field7) {
                    var3 = this.field7;
                }
                this.field9[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field9[var13] != 0L) {
                            this.field9[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field8) {
                    var3 = this.field8;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field28 = this.field24;
                    this.field29 = this.field25;
                    this.field30 = this.field26;
                    this.field31 = this.field27;
                    this.field24 = 0;
                    this.method7(0);
                    this.field34 = this.field35;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field7 > 0) {
                    this.field10 = var2 * 1000 / (this.field7 * 256);
                }
                this.method9(true);
            } while (!this.field11);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field9[var15]);
            }
            System.out.println("fps:" + this.field10 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field7 + " mindel:" + this.field8);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field11 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(I)V")
    public final void method3(int arg0) {
        this.field6 = -2;
        this.method8(22257);
        if (arg0 != 6568) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (this.field17 == null) {
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
        this.field7 = 1000 / arg1;
        if (arg0 != -27605) {
            this.field5 = !this.field5;
        }
    }

    @OriginalMember(owner = "a", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field6 >= 0) {
            this.field6 = 0;
        }
    }

    @OriginalMember(owner = "a", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field6 >= 0) {
            this.field6 = 4000 / this.field7;
        }
    }

    @OriginalMember(owner = "a", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field6 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field6 == -1) {
            this.method3(6568);
        }
    }

    @OriginalMember(owner = "a", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field14 == null) {
            this.field14 = arg0;
        }
        this.field18 = true;
        this.method10(148);
    }

    @OriginalMember(owner = "a", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field14 == null) {
            this.field14 = arg0;
        }
        this.field18 = true;
        this.method10(148);
    }

    @OriginalMember(owner = "a", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field17 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field20 = 0;
        this.field25 = var2;
        this.field26 = var3;
        this.field27 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field24 = 2;
            this.field21 = 2;
        } else {
            this.field24 = 1;
            this.field21 = 1;
        }
    }

    @OriginalMember(owner = "a", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field20 = 0;
        this.field21 = 0;
    }

    @OriginalMember(owner = "a", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field20 = 0;
        this.field22 = -1;
        this.field23 = -1;
    }

    @OriginalMember(owner = "a", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field17 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field20 = 0;
        this.field22 = var2;
        this.field23 = var3;
    }

    @OriginalMember(owner = "a", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field17 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field20 = 0;
        this.field22 = var2;
        this.field23 = var3;
    }

    @OriginalMember(owner = "a", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field20 = 0;
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
            this.field32[var3] = 1;
        }
        if (var3 > 4) {
            this.field33[this.field35] = var3;
            this.field35 = this.field35 + 1 & 0x7F;
        }
        if (Linkable.field365) {
        }
    }

    @OriginalMember(owner = "a", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field20 = 0;
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
            this.field32[var3] = 0;
        }
    }

    @OriginalMember(owner = "a", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(B)I")
    public final int method5(byte arg0) {
        if (arg0 != 5) {
            return 0;
        }
        int var2 = -1;
        if (this.field35 != this.field34) {
            var2 = this.field33[this.field34];
            this.field34 = this.field34 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field19 = true;
        this.field18 = true;
        this.method10(148);
    }

    @OriginalMember(owner = "a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field19 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field32[var2] = 0;
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

    @OriginalMember(owner = "a", name = "b", descriptor = "(I)V")
    public void method7(int arg0) {
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "a", name = "c", descriptor = "(I)V")
    public void method8(int arg0) {
        if (arg0 != 22257) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(Z)V")
    public void method9(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "a", name = "d", descriptor = "(I)V")
    public void method10(int arg0) {
        int var2 = 36 / arg0;
    }

    @OriginalMember(owner = "a", name = "b", descriptor = "(B)Ljava/awt/Component;")
    public java.awt.Component method11(byte arg0) {
        if (arg0 != 7) {
            throw new NullPointerException();
        }
        return this.field17 == null ? this : this.field17;
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method12(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public void method13(String arg0, int arg1, int arg2) {
        while (this.field14 == null) {
            this.field14 = this.method11(this.field2).getGraphics();
            try {
                this.method11(this.field2).repaint();
            } catch (Exception var11) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var10) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        if (arg2 < 7 || arg2 > 7) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        FontMetrics var6 = this.method11(this.field2).getFontMetrics(var4);
        Font var7 = new Font("Helvetica", 0, 13);
        this.method11(this.field2).getFontMetrics(var7);
        if (this.field18) {
            this.field14.setColor(Color.black);
            this.field14.fillRect(0, 0, this.field12, this.field13);
            this.field18 = false;
        }
        Color var8 = new Color(140, 17, 17);
        int var9 = this.field13 / 2 - 18;
        this.field14.setColor(var8);
        this.field14.drawRect(this.field12 / 2 - 152, var9, 304, 34);
        this.field14.fillRect(this.field12 / 2 - 150, var9 + 2, arg1 * 3, 30);
        this.field14.setColor(Color.black);
        this.field14.fillRect(arg1 * 3 + this.field12 / 2 - 150, var9 + 2, 300 - arg1 * 3, 30);
        this.field14.setFont(var4);
        this.field14.setColor(Color.white);
        this.field14.drawString(arg0, (this.field12 - var6.stringWidth(arg0)) / 2, var9 + 22);
    }
}
