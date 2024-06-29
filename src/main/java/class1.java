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

@OriginalClass("mapview!a")
public class class1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "I")
    private int field1 = 0;

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "I")
    private int field2 = 20;

    @OriginalMember(owner = "mapview!a", name = "c", descriptor = "I")
    public int field3 = 1;

    @OriginalMember(owner = "mapview!a", name = "d", descriptor = "[J")
    private long[] field4 = new long[10];

    @OriginalMember(owner = "mapview!a", name = "e", descriptor = "I")
    public int field5 = 0;

    @OriginalMember(owner = "mapview!a", name = "f", descriptor = "Z")
    public boolean field6 = false;

    @OriginalMember(owner = "mapview!a", name = "k", descriptor = "[Lg;")
    public class7[] field11 = new class7[6];

    @OriginalMember(owner = "mapview!a", name = "m", descriptor = "Z")
    public boolean field13 = true;

    @OriginalMember(owner = "mapview!a", name = "n", descriptor = "Z")
    public boolean field14 = true;

    @OriginalMember(owner = "mapview!a", name = "o", descriptor = "I")
    public int field15 = 0;

    @OriginalMember(owner = "mapview!a", name = "p", descriptor = "I")
    public int field16 = 0;

    @OriginalMember(owner = "mapview!a", name = "q", descriptor = "I")
    public int field17 = 0;

    @OriginalMember(owner = "mapview!a", name = "r", descriptor = "I")
    public int field18 = 0;

    @OriginalMember(owner = "mapview!a", name = "s", descriptor = "I")
    public int field19 = 0;

    @OriginalMember(owner = "mapview!a", name = "t", descriptor = "I")
    public int field20 = 0;

    @OriginalMember(owner = "mapview!a", name = "u", descriptor = "I")
    public int field21 = 0;

    @OriginalMember(owner = "mapview!a", name = "v", descriptor = "J")
    public long field22 = 0L;

    @OriginalMember(owner = "mapview!a", name = "w", descriptor = "I")
    public int field23 = 0;

    @OriginalMember(owner = "mapview!a", name = "x", descriptor = "I")
    public int field24 = 0;

    @OriginalMember(owner = "mapview!a", name = "y", descriptor = "I")
    public int field25 = 0;

    @OriginalMember(owner = "mapview!a", name = "z", descriptor = "J")
    public long field26 = 0L;

    @OriginalMember(owner = "mapview!a", name = "A", descriptor = "[I")
    public int[] field27 = new int[128];

    @OriginalMember(owner = "mapview!a", name = "B", descriptor = "[I")
    private int[] field28 = new int[128];

    @OriginalMember(owner = "mapview!a", name = "C", descriptor = "I")
    private int field29 = 0;

    @OriginalMember(owner = "mapview!a", name = "D", descriptor = "I")
    private int field30 = 0;

    @OriginalMember(owner = "mapview!a", name = "g", descriptor = "I")
    public int field7;

    @OriginalMember(owner = "mapview!a", name = "h", descriptor = "I")
    public int field8;

    @OriginalMember(owner = "mapview!a", name = "j", descriptor = "Ll;")
    public class12 field10;

    @OriginalMember(owner = "mapview!a", name = "l", descriptor = "Lb;")
    public class2 field12;

    @OriginalMember(owner = "mapview!a", name = "i", descriptor = "Ljava/awt/Graphics;")
    public Graphics field9;

    @OriginalMember(owner = "mapview!a", name = "E", descriptor = "Z")
    public static boolean field31;

    @OriginalMember(owner = "mapview!a", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field1 >= 0) {
            this.field1 = 4000 / this.field2;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "()V")
    public void method1() {
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(ILjava/lang/String;)V")
    public void method2(int arg0, String arg1) {
        while (this.field9 == null) {
            this.field9 = this.method9().getGraphics();
            try {
                this.method9().repaint();
            } catch (Exception var12) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var11) {
            }
        }
        Font var5 = new Font("Helvetica", 1, 13);
        FontMetrics var6 = this.method9().getFontMetrics(var5);
        Font var7 = new Font("Helvetica", 0, 13);
        FontMetrics var8 = this.method9().getFontMetrics(var7);
        if (this.field13) {
            this.field9.setColor(Color.black);
            this.field9.fillRect(0, 0, this.field7, this.field8);
            this.field13 = false;
        }
        Color var9 = new Color(140, 17, 17);
        int var10 = this.field8 / 2 - 18;
        this.field9.setColor(var9);
        this.field9.drawRect(this.field7 / 2 - 152, var10, 304, 34);
        this.field9.fillRect(this.field7 / 2 - 150, var10 + 2, arg0 * 3, 30);
        this.field9.setColor(Color.black);
        this.field9.fillRect(arg0 * 3 + this.field7 / 2 - 150, var10 + 2, 300 - arg0 * 3, 30);
        this.field9.setFont(var5);
        this.field9.setColor(Color.white);
        this.field9.drawString(arg1, (this.field7 - var6.stringWidth(arg1)) / 2, var10 + 22);
    }

    @OriginalMember(owner = "mapview!a", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field15 = 0;
        this.field16 = 0;
    }

    @OriginalMember(owner = "mapview!a", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field15 = 0;
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
            this.field27[var3] = 1;
        }
        if (var3 > 4) {
            this.field28[this.field30] = var3;
            this.field30 = this.field30 + 1 & 0x7F;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method3(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "mapview!a", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "()V")
    public final void method4() {
        this.field1 = -2;
        this.method11();
        if (this.field12 == null) {
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

    @OriginalMember(owner = "mapview!a", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field9 == null) {
            this.field9 = arg0;
        }
        this.field13 = true;
        this.method1();
    }

    @OriginalMember(owner = "mapview!a", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "mapview!a", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field15 = 0;
        this.field17 = -1;
        this.field18 = -1;
    }

    @OriginalMember(owner = "mapview!a", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!a", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!a", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!a", name = "c", descriptor = "()V")
    public void method5() {
    }

    @OriginalMember(owner = "mapview!a", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field1 >= 0) {
            this.field1 = 0;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(II)V")
    public final void method6(int arg0, int arg1) {
        this.field7 = arg0;
        this.field8 = arg1;
        this.field12 = new class2(this, this.field7, this.field8);
        this.field9 = this.method9().getGraphics();
        this.field10 = new class12(this.field7, this.field8, this.method9());
        this.method3(this, 1);
    }

    @OriginalMember(owner = "mapview!a", name = "d", descriptor = "()I")
    public final int method7() {
        int var1 = -1;
        if (this.field30 != this.field29) {
            var1 = this.field28[this.field29];
            this.field29 = this.field29 + 1 & 0x7F;
        }
        return var1;
    }

    @OriginalMember(owner = "mapview!a", name = "e", descriptor = "()V")
    public void method8() {
    }

    @OriginalMember(owner = "mapview!a", name = "f", descriptor = "()Ljava/awt/Component;")
    public Component method9() {
        return this.field12 == null ? this : this.field12;
    }

    @OriginalMember(owner = "mapview!a", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "mapview!a", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field12 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field15 = 0;
        this.field20 = var2;
        this.field21 = var3;
        this.field22 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field19 = 2;
            this.field16 = 2;
        } else {
            this.field19 = 1;
            this.field16 = 1;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field12 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field15 = 0;
        this.field17 = var2;
        this.field18 = var3;
    }

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "(II)V")
    public final void method10(int arg0, int arg1) {
        this.field7 = arg0;
        this.field8 = arg1;
        this.field9 = this.method9().getGraphics();
        this.field10 = new class12(this.field7, this.field8, this.method9());
        this.method3(this, 1);
    }

    @OriginalMember(owner = "mapview!a", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field12 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field15 = 0;
        this.field17 = var2;
        this.field18 = var3;
    }

    @OriginalMember(owner = "mapview!a", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "mapview!a", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!a", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field9 == null) {
            this.field9 = arg0;
        }
        this.field13 = true;
        this.method1();
    }

    @OriginalMember(owner = "mapview!a", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field1 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var2) {
        }
        if (this.field1 == -1) {
            this.method4();
        }
    }

    @OriginalMember(owner = "mapview!a", name = "g", descriptor = "()V")
    public void method11() {
    }

    @OriginalMember(owner = "mapview!a", name = "h", descriptor = "()V")
    public void method12() {
    }

    @OriginalMember(owner = "mapview!a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field14 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field27[var2] = 0;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field15 = 0;
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
            this.field27[var3] = 0;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "mapview!a", name = "run", descriptor = "()V")
    public void run() {
        this.method9().addMouseListener(this);
        this.method9().addMouseMotionListener(this);
        this.method9().addKeyListener(this);
        this.method9().addFocusListener(this);
        if (this.field12 != null) {
            this.field12.addWindowListener(this);
        }
        this.method2(0, "Loading...");
        this.method5();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field4[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field1 < 0) {
                    if (this.field1 == -1) {
                        this.method4();
                    }
                    return;
                }
                if (this.field1 > 0) {
                    this.field1 += -1;
                    if (this.field1 == 0) {
                        this.method4();
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field4[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field4[var1]) {
                    var2 = (int) ((long) (this.field2 * 2560) / (var11 - this.field4[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field2 - (var11 - this.field4[var1]) / 10L);
                }
                if (var3 > this.field2) {
                    var3 = this.field2;
                }
                this.field4[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field4[var13] != 0L) {
                            this.field4[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field3) {
                    var3 = this.field3;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var17) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field23 = this.field19;
                    this.field24 = this.field20;
                    this.field25 = this.field21;
                    this.field26 = this.field22;
                    this.field19 = 0;
                    this.method12();
                    this.field29 = this.field30;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field2 > 0) {
                    this.field5 = var2 * 1000 / (this.field2 * 256);
                }
                this.method8();
            } while (!this.field6);
            System.out.println("ntime:" + var11);
            for (int var15 = 0; var15 < 10; var15++) {
                int var16 = (var1 + 20 - var15 - 1) % 10;
                System.out.println("otim" + var16 + ":" + this.field4[var16]);
            }
            System.out.println("fps:" + this.field5 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field2 + " mindel:" + this.field3);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field6 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field14 = true;
        this.field13 = true;
        this.method1();
    }

    @OriginalMember(owner = "mapview!a", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }
}
