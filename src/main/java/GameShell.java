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
    private int field1 = 131;

    @OriginalMember(owner = "a", name = "b", descriptor = "I")
    private int field2 = 131;

    @OriginalMember(owner = "a", name = "c", descriptor = "Z")
    private boolean field3 = true;

    @OriginalMember(owner = "a", name = "d", descriptor = "I")
    private int field4 = 851;

    @OriginalMember(owner = "a", name = "e", descriptor = "I")
    private int field5 = 1;

    @OriginalMember(owner = "a", name = "f", descriptor = "Z")
    private boolean field6 = false;

    @OriginalMember(owner = "a", name = "g", descriptor = "Z")
    private boolean field7 = false;

    @OriginalMember(owner = "a", name = "i", descriptor = "I")
    private int field9 = 20;

    @OriginalMember(owner = "a", name = "j", descriptor = "I")
    public int field10 = 1;

    @OriginalMember(owner = "a", name = "k", descriptor = "[J")
    private long[] field11 = new long[10];

    @OriginalMember(owner = "a", name = "m", descriptor = "Z")
    public boolean field13 = false;

    @OriginalMember(owner = "a", name = "r", descriptor = "[Lib;")
    public Pix32[] field18 = new Pix32[6];

    @OriginalMember(owner = "a", name = "t", descriptor = "Z")
    public boolean field20 = true;

    @OriginalMember(owner = "a", name = "u", descriptor = "Z")
    public boolean field21 = true;

    @OriginalMember(owner = "a", name = "H", descriptor = "[I")
    public int[] field34 = new int[128];

    @OriginalMember(owner = "a", name = "I", descriptor = "[I")
    private int[] field35 = new int[128];

    @OriginalMember(owner = "a", name = "l", descriptor = "I")
    public int field12;

    @OriginalMember(owner = "a", name = "n", descriptor = "I")
    public int field14;

    @OriginalMember(owner = "a", name = "o", descriptor = "I")
    public int field15;

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

    @OriginalMember(owner = "a", name = "D", descriptor = "I")
    public int field30;

    @OriginalMember(owner = "a", name = "E", descriptor = "I")
    public int field31;

    @OriginalMember(owner = "a", name = "F", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "a", name = "J", descriptor = "I")
    private int field36;

    @OriginalMember(owner = "a", name = "K", descriptor = "I")
    private int field37;

    @OriginalMember(owner = "a", name = "L", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "a", name = "h", descriptor = "I")
    private int field8;

    @OriginalMember(owner = "a", name = "C", descriptor = "J")
    public long field29;

    @OriginalMember(owner = "a", name = "G", descriptor = "J")
    public long field33;

    @OriginalMember(owner = "a", name = "q", descriptor = "Lqb;")
    public PixMap field17;

    @OriginalMember(owner = "a", name = "s", descriptor = "Lb;")
    public ViewBox field19;

    @OriginalMember(owner = "a", name = "p", descriptor = "Ljava/awt/Graphics;")
    public Graphics field16;

    @OriginalMember(owner = "a", name = "a", descriptor = "(III)V")
    public final void method1(int arg0, int arg1, int arg2) {
        this.field14 = arg0;
        this.field15 = arg1;
        this.field19 = new ViewBox(this.field15, this, -43, this.field14);
        this.field16 = this.method11(1).getGraphics();
        if (arg2 != 0) {
            this.field7 = !this.field7;
        }
        this.field17 = new PixMap(this.method11(1), (byte) 3, this.field15, this.field14);
        this.method12(this, 1);
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(IBI)V")
    public final void method2(int arg0, byte arg1, int arg2) {
        this.field14 = arg2;
        this.field15 = arg0;
        this.field16 = this.method11(1).getGraphics();
        if (arg1 == 40) {
            this.field17 = new PixMap(this.method11(1), (byte) 3, this.field15, this.field14);
            this.method12(this, 1);
        }
    }

    @OriginalMember(owner = "a", name = "run", descriptor = "()V")
    public void run() {
        this.method11(1).addMouseListener(this);
        this.method11(1).addMouseMotionListener(this);
        this.method11(1).addKeyListener(this);
        this.method11(1).addFocusListener(this);
        if (this.field19 != null) {
            this.field19.addWindowListener(this);
        }
        this.method13((byte) 22, 0, "Loading...");
        this.method6();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field11[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field8 < 0) {
                    if (this.field8 == -1) {
                        this.method3(this.field1);
                    }
                    return;
                }
                if (this.field8 > 0) {
                    this.field8--;
                    if (this.field8 == 0) {
                        this.method3(this.field1);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field11[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field11[var1]) {
                    var2 = (int) ((long) (this.field9 * 2560) / (var11 - this.field11[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field9 - (var11 - this.field11[var1]) / 10L);
                }
                if (var3 > this.field9) {
                    var3 = this.field9;
                }
                this.field11[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field11[var13] != 0L) {
                            this.field11[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field10) {
                    var3 = this.field10;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field30 = this.field26;
                    this.field31 = this.field27;
                    this.field32 = this.field28;
                    this.field33 = this.field29;
                    this.field26 = 0;
                    this.method7(7);
                    this.field36 = this.field37;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field9 > 0) {
                    this.field12 = var2 * 1000 / (this.field9 * 256);
                }
                this.method9((byte) 9);
            } while (!this.field13);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field11[var15]);
            }
            System.out.println("fps:" + this.field12 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field9 + " mindel:" + this.field10);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field13 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(I)V")
    public final void method3(int arg0) {
        this.field8 = -2;
        if (arg0 <= 0) {
            this.field1 = -324;
        }
        this.method8(true);
        if (this.field19 == null) {
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
        int var3 = 52 / arg1;
        this.field9 = 1000 / arg0;
    }

    @OriginalMember(owner = "a", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field8 >= 0) {
            this.field8 = 0;
        }
    }

    @OriginalMember(owner = "a", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field8 >= 0) {
            this.field8 = 4000 / this.field9;
        }
    }

    @OriginalMember(owner = "a", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field8 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field8 == -1) {
            this.method3(this.field1);
        }
    }

    @OriginalMember(owner = "a", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field16 == null) {
            this.field16 = arg0;
        }
        this.field20 = true;
        this.method10(this.field4);
    }

    @OriginalMember(owner = "a", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field16 == null) {
            this.field16 = arg0;
        }
        this.field20 = true;
        this.method10(this.field4);
    }

    @OriginalMember(owner = "a", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field19 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field22 = 0;
        this.field27 = var2;
        this.field28 = var3;
        this.field29 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field26 = 2;
            this.field23 = 2;
        } else {
            this.field26 = 1;
            this.field23 = 1;
        }
    }

    @OriginalMember(owner = "a", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field22 = 0;
        this.field23 = 0;
    }

    @OriginalMember(owner = "a", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field22 = 0;
        this.field24 = -1;
        this.field25 = -1;
    }

    @OriginalMember(owner = "a", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field19 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field22 = 0;
        this.field24 = var2;
        this.field25 = var3;
    }

    @OriginalMember(owner = "a", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field19 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field22 = 0;
        this.field24 = var2;
        this.field25 = var3;
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
            this.field34[var3] = 1;
        }
        if (var3 > 4) {
            this.field35[this.field37] = var3;
            this.field37 = this.field37 + 1 & 0x7F;
        }
        if (Linkable.field363) {
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
            this.field34[var3] = 0;
        }
    }

    @OriginalMember(owner = "a", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "b", descriptor = "(I)I")
    public final int method5(int arg0) {
        while (arg0 >= 0) {
            this.field6 = !this.field6;
        }
        int var2 = -1;
        if (this.field37 != this.field36) {
            var2 = this.field35[this.field36];
            this.field36 = this.field36 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field21 = true;
        this.field20 = true;
        this.method10(this.field4);
    }

    @OriginalMember(owner = "a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field21 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field34[var2] = 0;
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
        if (arg0 < 7 || arg0 > 7) {
            this.field7 = !this.field7;
        }
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(Z)V")
    public void method8(boolean arg0) {
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(B)V")
    public void method9(byte arg0) {
        if (arg0 == 9) {
            boolean var2 = false;
        }
    }

    @OriginalMember(owner = "a", name = "d", descriptor = "(I)V")
    public void method10(int arg0) {
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "a", name = "e", descriptor = "(I)Ljava/awt/Component;")
    public java.awt.Component method11(int arg0) {
        if (arg0 < this.field5 || arg0 > this.field5) {
            this.field4 = -105;
        }
        return this.field19 == null ? this : this.field19;
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method12(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(BILjava/lang/String;)V")
    public void method13(byte arg0, int arg1, String arg2) {
        while (this.field16 == null) {
            this.field16 = this.method11(1).getGraphics();
            try {
                this.method11(1).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method11(1).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method11(1).getFontMetrics(var6);
        if (this.field20) {
            this.field16.setColor(Color.black);
            this.field16.fillRect(0, 0, this.field14, this.field15);
            this.field20 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field15 / 2 - 18;
        this.field16.setColor(var7);
        this.field16.drawRect(this.field14 / 2 - 152, var8, 304, 34);
        this.field16.fillRect(this.field14 / 2 - 150, var8 + 2, arg1 * 3, 30);
        this.field16.setColor(Color.black);
        this.field16.fillRect(arg1 * 3 + this.field14 / 2 - 150, var8 + 2, 300 - arg1 * 3, 30);
        this.field16.setFont(var4);
        if (arg0 == 22) {
            this.field16.setColor(Color.white);
            this.field16.drawString(arg2, (this.field14 - var5.stringWidth(arg2)) / 2, var8 + 22);
        }
    }
}
