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

    @OriginalMember(owner = "a", name = "a", descriptor = "B")
    private byte field1 = -64;

    @OriginalMember(owner = "a", name = "c", descriptor = "I")
    private int field3 = 2;

    @OriginalMember(owner = "a", name = "d", descriptor = "B")
    private byte field4 = 4;

    @OriginalMember(owner = "a", name = "e", descriptor = "Z")
    private boolean field5 = false;

    @OriginalMember(owner = "a", name = "g", descriptor = "I")
    private int field7 = 20;

    @OriginalMember(owner = "a", name = "h", descriptor = "I")
    public int field8 = 1;

    @OriginalMember(owner = "a", name = "i", descriptor = "[J")
    private long[] field9 = new long[10];

    @OriginalMember(owner = "a", name = "o", descriptor = "[Lgb;")
    public Pix32[] field15 = new Pix32[6];

    @OriginalMember(owner = "a", name = "q", descriptor = "Z")
    public boolean field17 = true;

    @OriginalMember(owner = "a", name = "y", descriptor = "[I")
    public int[] field25 = new int[128];

    @OriginalMember(owner = "a", name = "z", descriptor = "[I")
    private int[] field26 = new int[128];

    @OriginalMember(owner = "a", name = "j", descriptor = "I")
    public int field10;

    @OriginalMember(owner = "a", name = "k", descriptor = "I")
    public int field11;

    @OriginalMember(owner = "a", name = "l", descriptor = "I")
    public int field12;

    @OriginalMember(owner = "a", name = "r", descriptor = "I")
    public int field18;

    @OriginalMember(owner = "a", name = "s", descriptor = "I")
    public int field19;

    @OriginalMember(owner = "a", name = "b", descriptor = "I")
    private int field2;

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

    @OriginalMember(owner = "a", name = "A", descriptor = "I")
    private int field27;

    @OriginalMember(owner = "a", name = "B", descriptor = "I")
    private int field28;

    @OriginalMember(owner = "a", name = "f", descriptor = "I")
    private int field6;

    @OriginalMember(owner = "a", name = "n", descriptor = "Lpb;")
    public PixMap field14;

    @OriginalMember(owner = "a", name = "p", descriptor = "Lb;")
    public ViewBox field16;

    @OriginalMember(owner = "a", name = "m", descriptor = "Ljava/awt/Graphics;")
    public Graphics field13;

    @OriginalMember(owner = "a", name = "C", descriptor = "Z")
    public static boolean field29;

    @OriginalMember(owner = "a", name = "a", descriptor = "(IBI)V")
    public final void method1(int arg0, byte arg1, int arg2) {
        this.field11 = arg2;
        this.field12 = arg0;
        this.field16 = new ViewBox(this.field11, this, 22967, this.field12);
        this.field13 = this.method11((byte) 8).getGraphics();
        this.field14 = new PixMap(this.field12, 604, this.field11, this.method11((byte) 8));
        if (this.field4 == arg1) {
            this.method12(this, 1);
        }
    }

    @OriginalMember(owner = "a", name = "b", descriptor = "(IBI)V")
    public final void method2(int arg0, byte arg1, int arg2) {
        if (arg1 != 104) {
            return;
        }
        this.field11 = arg2;
        this.field12 = arg0;
        this.field13 = this.method11((byte) 8).getGraphics();
        this.field14 = new PixMap(this.field12, 604, this.field11, this.method11((byte) 8));
        this.method12(this, 1);
    }

    @OriginalMember(owner = "a", name = "run", descriptor = "()V")
    public void run() {
        System.out.println("Registering event listeners");
        this.method11((byte) 8).addMouseListener(this);
        this.method11((byte) 8).addMouseMotionListener(this);
        this.method11((byte) 8).addKeyListener(this);
        this.method11((byte) 8).addFocusListener(this);
        if (this.field16 != null) {
            this.field16.addWindowListener(this);
        }
        this.method13("Loading...", 0, false);
        this.method6();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        for (int var5 = 0; var5 < 10; var5++) {
            this.field9[var5] = System.currentTimeMillis();
        }
        long var6 = System.currentTimeMillis();
        while (this.field6 >= 0) {
            if (this.field6 > 0) {
                this.field6--;
                if (this.field6 == 0) {
                    this.method3((byte) 8);
                    return;
                }
            }
            int var8 = var2;
            int var9 = var3;
            var2 = 300;
            var3 = 1;
            long var10 = System.currentTimeMillis();
            if (this.field9[var1] == 0L) {
                var2 = var8;
                var3 = var9;
            } else if (var10 > this.field9[var1]) {
                var2 = (int) ((long) (this.field7 * 2560) / (var10 - this.field9[var1]));
            }
            if (var2 < 25) {
                var2 = 25;
            }
            if (var2 > 256) {
                var2 = 256;
                var3 = (int) ((long) this.field7 - (var10 - this.field9[var1]) / 10L);
            }
            this.field9[var1] = var10;
            var1 = (var1 + 1) % 10;
            if (var3 > 1) {
                for (int var12 = 0; var12 < 10; var12++) {
                    if (this.field9[var12] != 0L) {
                        this.field9[var12] += var3;
                    }
                }
            }
            if (var3 < this.field8) {
                var3 = this.field8;
            }
            try {
                Thread.sleep((long) var3);
            } catch (InterruptedException var13) {
            }
            while (var4 < 256) {
                this.method7(0);
                this.field22 = 0;
                this.field27 = this.field28;
                var4 += var2;
            }
            var4 &= 0xFF;
            if (this.field7 > 0) {
                this.field10 = var2 * 1000 / (this.field7 * 256);
            }
            this.method9(4);
        }
        if (this.field6 == -1) {
            this.method3((byte) 8);
        }
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(B)V")
    public final void method3(byte arg0) {
        this.field6 = -2;
        System.out.println("Closing program");
        this.method8(this.field1);
        if (arg0 == 8) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        try {
            Thread.sleep(1000L);
        } catch (Exception var5) {
        }
        try {
            System.exit(0);
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(II)V")
    public final void method4(int arg0, int arg1) {
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field7 = 1000 / arg0;
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
            System.out.println("5 seconds expired, forcing kill");
            this.method3((byte) 8);
        }
    }

    @OriginalMember(owner = "a", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field17 = true;
        this.method10(-467);
    }

    @OriginalMember(owner = "a", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field17 = true;
        this.method10(-467);
    }

    @OriginalMember(owner = "a", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field16 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field18 = 0;
        this.field23 = var2;
        this.field24 = var3;
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
    }

    @OriginalMember(owner = "a", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field16 != null) {
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
        if (this.field16 != null) {
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
            this.field25[var3] = 1;
        }
        if (var3 > 4) {
            this.field26[this.field28] = var3;
            this.field28 = this.field28 + 1 & 0x7F;
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
            this.field25[var3] = 0;
        }
    }

    @OriginalMember(owner = "a", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field17 = true;
        this.method10(-467);
    }

    @OriginalMember(owner = "a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(Z)I")
    public final int method5(boolean arg0) {
        if (arg0) {
            return this.field3;
        }
        int var2 = -1;
        if (this.field28 != this.field27) {
            var2 = this.field26[this.field27];
            this.field27 = this.field27 + 1 & 0x7F;
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

    @OriginalMember(owner = "a", name = "a", descriptor = "(I)V")
    public void method7(int arg0) {
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "a", name = "b", descriptor = "(B)V")
    public void method8(byte arg0) {
        if (arg0 != -64) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "a", name = "b", descriptor = "(I)V")
    public void method9(int arg0) {
        if (arg0 < 4 || arg0 > 4) {
            ;
        }
    }

    @OriginalMember(owner = "a", name = "c", descriptor = "(I)V")
    public void method10(int arg0) {
        while (arg0 >= 0) {
            this.field5 = !this.field5;
        }
    }

    @OriginalMember(owner = "a", name = "c", descriptor = "(B)Ljava/awt/Component;")
    public java.awt.Component method11(byte arg0) {
        if (arg0 == 8) {
            boolean var2 = false;
        } else {
            this.field2 = -278;
        }
        return this.field16 == null ? this : this.field16;
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method12(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public void method13(String arg0, int arg1, boolean arg2) {
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method11((byte) 8).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method11((byte) 8).getFontMetrics(var6);
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
        if (!arg2) {
            this.field13.fillRect(arg1 * 3 + this.field11 / 2 - 150, var8 + 2, 300 - arg1 * 3, 30);
            this.field13.setFont(var4);
            this.field13.setColor(Color.white);
            this.field13.drawString(arg0, (this.field11 - var5.stringWidth(arg0)) / 2, var8 + 22);
        }
    }
}
