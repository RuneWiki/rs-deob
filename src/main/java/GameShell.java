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
    private int field1 = -17143;

    @OriginalMember(owner = "a", name = "b", descriptor = "Z")
    private boolean field2 = false;

    @OriginalMember(owner = "a", name = "c", descriptor = "B")
    private byte field3 = 5;

    @OriginalMember(owner = "a", name = "d", descriptor = "B")
    private byte field4 = -14;

    @OriginalMember(owner = "a", name = "e", descriptor = "B")
    private byte field5 = 3;

    @OriginalMember(owner = "a", name = "f", descriptor = "B")
    private byte field6 = 123;

    @OriginalMember(owner = "a", name = "g", descriptor = "I")
    private int field7 = -43626;

    @OriginalMember(owner = "a", name = "h", descriptor = "B")
    private byte field8 = 0;

    @OriginalMember(owner = "a", name = "i", descriptor = "I")
    private int field9 = 17194;

    @OriginalMember(owner = "a", name = "j", descriptor = "Z")
    private boolean field10 = false;

    @OriginalMember(owner = "a", name = "l", descriptor = "I")
    private int field12 = 20;

    @OriginalMember(owner = "a", name = "m", descriptor = "I")
    public int field13 = 1;

    @OriginalMember(owner = "a", name = "n", descriptor = "[J")
    private long[] field14 = new long[10];

    @OriginalMember(owner = "a", name = "t", descriptor = "[Lhb;")
    public Pix32[] field20 = new Pix32[6];

    @OriginalMember(owner = "a", name = "v", descriptor = "Z")
    public boolean field22 = true;

    @OriginalMember(owner = "a", name = "D", descriptor = "[I")
    public int[] field30 = new int[128];

    @OriginalMember(owner = "a", name = "E", descriptor = "[I")
    private int[] field31 = new int[128];

    @OriginalMember(owner = "a", name = "k", descriptor = "I")
    private int field11;

    @OriginalMember(owner = "a", name = "o", descriptor = "I")
    public int field15;

    @OriginalMember(owner = "a", name = "p", descriptor = "I")
    public int field16;

    @OriginalMember(owner = "a", name = "q", descriptor = "I")
    public int field17;

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

    @OriginalMember(owner = "a", name = "C", descriptor = "I")
    public int field29;

    @OriginalMember(owner = "a", name = "F", descriptor = "I")
    private int field32;

    @OriginalMember(owner = "a", name = "G", descriptor = "I")
    private int field33;

    @OriginalMember(owner = "a", name = "H", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "a", name = "s", descriptor = "Lqb;")
    public PixMap field19;

    @OriginalMember(owner = "a", name = "u", descriptor = "Lb;")
    public ViewBox field21;

    @OriginalMember(owner = "a", name = "r", descriptor = "Ljava/awt/Graphics;")
    public Graphics field18;

    @OriginalMember(owner = "a", name = "a", descriptor = "(IBI)V")
    public final void method1(int arg0, byte arg1, int arg2) {
        this.field16 = arg2;
        this.field17 = arg0;
        this.field21 = new ViewBox(this, this.field17, (byte) 5, this.field16);
        this.field18 = this.method11(this.field9).getGraphics();
        this.field19 = new PixMap((byte) -121, this.field17, this.method11(this.field9), this.field16);
        if (this.field4 == arg1) {
            this.method12(this, 1);
        }
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(III)V")
    public final void method2(int arg0, int arg1, int arg2) {
        if (arg2 < 2 || arg2 > 2) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field16 = arg0;
        this.field17 = arg1;
        this.field18 = this.method11(this.field9).getGraphics();
        this.field19 = new PixMap((byte) -121, this.field17, this.method11(this.field9), this.field16);
        this.method12(this, 1);
    }

    @OriginalMember(owner = "a", name = "run", descriptor = "()V")
    public void run() {
        this.method11(this.field9).addMouseListener(this);
        this.method11(this.field9).addMouseMotionListener(this);
        this.method11(this.field9).addKeyListener(this);
        this.method11(this.field9).addFocusListener(this);
        if (this.field21 != null) {
            this.field21.addWindowListener(this);
        }
        this.method13(0, 0, "Loading...");
        this.method6();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        for (int var5 = 0; var5 < 10; var5++) {
            this.field14[var5] = System.currentTimeMillis();
        }
        long var6 = System.currentTimeMillis();
        while (this.field11 >= 0) {
            if (this.field11 > 0) {
                this.field11--;
                if (this.field11 == 0) {
                    this.method3(-994);
                    return;
                }
            }
            int var8 = var2;
            int var9 = var3;
            var2 = 300;
            var3 = 1;
            long var10 = System.currentTimeMillis();
            if (this.field14[var1] == 0L) {
                var2 = var8;
                var3 = var9;
            } else if (var10 > this.field14[var1]) {
                var2 = (int) ((long) (this.field12 * 2560) / (var10 - this.field14[var1]));
            }
            if (var2 < 25) {
                var2 = 25;
            }
            if (var2 > 256) {
                var2 = 256;
                var3 = (int) ((long) this.field12 - (var10 - this.field14[var1]) / 10L);
            }
            this.field14[var1] = var10;
            var1 = (var1 + 1) % 10;
            if (var3 > 1) {
                for (int var12 = 0; var12 < 10; var12++) {
                    if (this.field14[var12] != 0L) {
                        this.field14[var12] += var3;
                    }
                }
            }
            if (var3 < this.field13) {
                var3 = this.field13;
            }
            try {
                Thread.sleep((long) var3);
            } catch (InterruptedException var13) {
            }
            while (var4 < 256) {
                this.method7((byte) 123);
                this.field27 = 0;
                this.field32 = this.field33;
                var4 += var2;
            }
            var4 &= 0xFF;
            if (this.field12 > 0) {
                this.field15 = var2 * 1000 / (this.field12 * 256);
            }
            this.method9(-43626);
        }
        if (this.field11 == -1) {
            this.method3(-994);
        }
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(I)V")
    public final void method3(int arg0) {
        if (arg0 >= 0) {
            return;
        }
        this.field11 = -2;
        this.method8(-12828);
        try {
            Thread.sleep(1000L);
        } catch (Exception var3) {
        }
        try {
            System.exit(0);
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(ZI)V")
    public final void method4(boolean arg0, int arg1) {
        this.field12 = 1000 / arg1;
        if (arg0) {
            ;
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
            this.method3(-994);
        }
    }

    @OriginalMember(owner = "a", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field18 == null) {
            this.field18 = arg0;
        }
        this.field22 = true;
        this.method10((byte) 0);
    }

    @OriginalMember(owner = "a", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field18 == null) {
            this.field18 = arg0;
        }
        this.field22 = true;
        this.method10((byte) 0);
    }

    @OriginalMember(owner = "a", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field21 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field23 = 0;
        this.field28 = var2;
        this.field29 = var3;
        if (arg0.isMetaDown()) {
            this.field27 = 2;
            this.field24 = 2;
        } else {
            this.field27 = 1;
            this.field24 = 1;
        }
        if (InputTracking.field78) {
            InputTracking.method38(var3, -427, var2, arg0.isMetaDown() ? 1 : 0);
        }
    }

    @OriginalMember(owner = "a", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field23 = 0;
        this.field24 = 0;
        if (InputTracking.field78) {
            InputTracking.method39(arg0.isMetaDown() ? 1 : 0, true);
        }
    }

    @OriginalMember(owner = "a", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
        if (InputTracking.field78) {
            InputTracking.method45(4);
        }
    }

    @OriginalMember(owner = "a", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        if (InputTracking.field78) {
            InputTracking.method46(45508);
        }
    }

    @OriginalMember(owner = "a", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field21 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field23 = 0;
        this.field25 = var2;
        this.field26 = var3;
        if (InputTracking.field78) {
            InputTracking.method40(-449, var3, var2);
        }
    }

    @OriginalMember(owner = "a", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field21 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field23 = 0;
        this.field25 = var2;
        this.field26 = var3;
        if (InputTracking.field78) {
            InputTracking.method40(-449, var3, var2);
        }
    }

    @OriginalMember(owner = "a", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field23 = 0;
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
        if (InputTracking.field78) {
            InputTracking.method41(false, var3);
        }
    }

    @OriginalMember(owner = "a", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field23 = 0;
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
        if (InputTracking.field78) {
            InputTracking.method42(var3, this.field3);
        }
    }

    @OriginalMember(owner = "a", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field22 = true;
        this.method10((byte) 0);
        if (InputTracking.field78) {
            InputTracking.method43(-861);
        }
    }

    @OriginalMember(owner = "a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        if (InputTracking.field78) {
            InputTracking.method44(-366);
        }
    }

    @OriginalMember(owner = "a", name = "b", descriptor = "(I)I")
    public final int method5(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = -1;
        if (this.field33 != this.field32) {
            var3 = this.field31[this.field32];
            this.field32 = this.field32 + 1 & 0x7F;
        }
        return var3;
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

    @OriginalMember(owner = "a", name = "a", descriptor = "(B)V")
    public void method7(byte arg0) {
        if (this.field6 != arg0) {
            this.field9 = -45;
        }
    }

    @OriginalMember(owner = "a", name = "c", descriptor = "(I)V")
    public void method8(int arg0) {
        if (arg0 == -12828) {
            ;
        }
    }

    @OriginalMember(owner = "a", name = "d", descriptor = "(I)V")
    public void method9(int arg0) {
        if (this.field7 == arg0) {
            ;
        }
    }

    @OriginalMember(owner = "a", name = "b", descriptor = "(B)V")
    public void method10(byte arg0) {
        if (this.field8 != arg0) {
            this.field2 = !this.field2;
        }
    }

    @OriginalMember(owner = "a", name = "e", descriptor = "(I)Ljava/awt/Component;")
    public java.awt.Component method11(int arg0) {
        if (this.field9 != arg0) {
            this.field10 = !this.field10;
        }
        return this.field21 == null ? this : this.field21;
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method12(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(IILjava/lang/String;)V")
    public void method13(int arg0, int arg1, String arg2) {
        while (this.field18 == null) {
            this.field18 = this.method11(this.field9).getGraphics();
            try {
                this.method11(this.field9).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method11(this.field9).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method11(this.field9).getFontMetrics(var6);
        if (this.field22) {
            this.field18.setColor(Color.black);
            this.field18.fillRect(0, 0, this.field16, this.field17);
            this.field22 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field17 / 2 - 18;
        this.field18.setColor(var7);
        this.field18.drawRect(this.field16 / 2 - 152, var8, 304, 34);
        this.field18.fillRect(this.field16 / 2 - 150, var8 + 2, arg0 * 3, 30);
        this.field18.setColor(Color.black);
        this.field18.fillRect(arg0 * 3 + this.field16 / 2 - 150, var8 + 2, 300 - arg0 * 3, 30);
        this.field18.setFont(var4);
        if (arg1 != 0) {
            this.field1 = -124;
        }
        this.field18.setColor(Color.white);
        this.field18.drawString(arg2, (this.field16 - var5.stringWidth(arg2)) / 2, var8 + 22);
    }
}
